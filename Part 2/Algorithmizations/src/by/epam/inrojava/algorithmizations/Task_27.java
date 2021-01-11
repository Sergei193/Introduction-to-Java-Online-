package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_27 {
    //            3.1 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//    дополнительный массив.
    Scanner algScanner = new Scanner(System.in);

    public Task_27() {
        int n, m, k;
        int[] array_1, array_2;
        try {
            System.out.println("Enter number of element first array");
            n = algScanner.nextInt();
            System.out.println("Enter number of element second array");
            m = algScanner.nextInt();
            array_1 = createArray(n);
            array_2 = createArray(m);
            System.out.println("First array");
            showArray(array_1);
            System.out.println("First array");
            showArray(array_2);
            System.out.println("\nEnter k from first array");
            k = algScanner.nextInt();
            System.out.println("Array after joining");
            joyingArrays(array_1, array_2, k);

        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private int[] createArray(int n) {
        int[] arrayTemp = new int[n];
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayTemp[i] = (int) (Math.random() * 100) - 50;
        }

        return arrayTemp;
    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void joyingArrays(int[] array_1, int[] array_2, int k) {
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i] + ", ");
            if (array_1[i] == k) {
                for (int j = 0; j < array_2.length; j++) {
                    System.out.println(array_2[j] + " , ");
                }
            }
        }
    }
}
