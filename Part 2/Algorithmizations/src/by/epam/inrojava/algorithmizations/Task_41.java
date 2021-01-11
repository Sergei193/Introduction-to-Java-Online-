package by.epam.inrojava.algorithmizations;

public class Task_41 {
    //    7.Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    int[] array = {1, 3, 5, 7, 9};
    int summa = 0;

    public Task_41() {
        try {
            summa = summaFactorial(array);
            System.out.println("The summa of factorials all odd numbers from 1 to 9 " + summa);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private int summaFactorial(int[] array) throws Exception {

        for (int i = 0; i < array.length; i++) {
            summa += factorial(array[i]);
        }
        return summa;
    }

    private int factorial(int n) throws Exception {
        int result = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }

        }
        return result;
    }
}
