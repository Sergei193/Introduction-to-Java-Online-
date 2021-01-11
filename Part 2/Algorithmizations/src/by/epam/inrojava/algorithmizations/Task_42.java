package by.epam.inrojava.algorithmizations;

public class Task_42 {
    //    8.Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//    массива с номерами от k до m.
    int m = 6;
    int[] array = new int[m];

    public Task_42() {
        try {
            array = fillingArray(m);
            showArray(array);
            System.out.println("Summa three elements (D[1] + D[2] + D[3])= " + summaElements(array, 1));
            System.out.println("Summa three elements (D[3] + D[4] + D[5])= " + summaElements(array, 3));
            System.out.println("Summa three elements ( D[4] +D[5] +D[6])= " + summaElements(array, 4));
        } catch (Exception e) {
            System.err.println(e.toString());
        }


    }

    private int[] fillingArray(int m) throws Exception {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        return array;
    }

    private void showArray(int[] array) throws Exception {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private int summaElements(int[] array, int k) throws Exception {
        int summa = 0;
        for (int i = k - 1; i < k + 2; i++) {
            summa += array[i];
        }
        return summa;
    }

}
