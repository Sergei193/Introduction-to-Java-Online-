package by.epam.inrojava.algorithmizations;

public class Task_51 {
    //        17. Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких  действий надо произвести, чтобы получился нуль?
//  Для решения задачи использовать декомпозицию.
    public Task_51() {
        try {
            int a = 1234;
            System.out.println("Number: " + a);

            int k = getActionCount(a);
            System.out.println("Actions count: " + k);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private static int getActionCount(int a) throws Exception {
        int k = 0;
        while (a > 0) {
            a -= getNumeralsSum(a);
            k++;
        }
        return k;
    }

    private static int getNumeralsSum(int a) throws Exception {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
