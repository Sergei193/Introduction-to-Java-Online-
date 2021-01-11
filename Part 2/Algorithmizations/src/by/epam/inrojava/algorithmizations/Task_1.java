package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;
//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task_1 {
    Scanner algScaner = new Scanner(System.in);
    Random algRandom = new Random();

    public Task_1() {
        try {
            int n, k, summa = 0;
            n = algRandom.nextInt(20 - 1);
            System.out.println("Size of array are " + n + "elements");
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100 - 1);
            }
            System.out.println("Elements of array ");
            for (int j : array) {
                System.out.print(+j + "; ");
            }
            System.out.print("\nEnter natural number K = ");
            k = algScaner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % k == 0) {
                    summa += array[i];
                }
            }
            System.out.println("Summa of elements that are multiple " + k + " = " + summa);
        } catch (Exception e) {
            System.err.println("Error task 1 !!!" + e.toString());
        }
    }
}
