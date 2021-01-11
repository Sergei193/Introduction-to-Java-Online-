package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Scanner;

public class Task_46 {
    //    12.Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//    элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
    Scanner algScanner = new Scanner(System.in);
    int[] array;

    public Task_46() {
        int k = 0, n = 0;
        try {
            boolean isCreate = true;
            while (isCreate) {

                System.out.println("Enter number K = ");
                k = algScanner.nextInt();
                System.out.println("Enter number N = ");
                n = algScanner.nextInt();
                if (k > n) {
                    isCreate = false;
                } else {

                    System.out.println("Number K must be greater N");
                    isCreate = true;
                }

            }
            createArray(k, n);
            showArray(array);

        } catch (Exception exception) {
            System.err.println(exception.toString());
        }

    }

    private void createArray(int k, int n) throws Exception {
        int count = 0;
        int summaElements = 0;
        int a = n - 1;
        int b = n - 2;
        array = new int[k / n + 1];
        for (int i = 0; i < array.length; i++) {
            count++;
            if (count <= array.length - 1) {
                array[i] = (int) (Math.random() * a) + b;
                summaElements += array[i];
            } else if (count == array.length) {
                array[i] = (k - summaElements);
            }

        }

    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

}
