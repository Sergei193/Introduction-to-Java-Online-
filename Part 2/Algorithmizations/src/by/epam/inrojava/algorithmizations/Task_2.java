package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    //    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
    //    числом. Подсчитать количество замен.
    Scanner algScaner = new Scanner(System.in);
    Random algRandom = new Random();

    public Task_2() {
        try {
            int n, z, count = 0;
            n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            System.out.println("Size of array are " + n + "elements");
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100 - 1);
                System.out.print(array[i] + "; ");
            }
            System.out.print("Enter natural of number Z = ");
            z = algScaner.nextInt();
            for (int j = 0; j < array.length; j++) {
                if (array[j] > z) {
                    array[j] = z;
                    count++;
                }
            }
            System.out.println("Array after replacement ");
            for (int i = 0;i< array.length;i++) {
                System.out.print(array[i] +"; ");
            }
            System.out.println("\nCount exchanged items " + count);

        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }
}
