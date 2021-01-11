package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    // 4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
    Random algRandom = new Random();

    public Task_4() {
        try {
            int n = 0, minEl = 0, maxEl = 0, exchangeEl = 0;
            n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
                System.out.print(array[i] + "; ");
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[maxEl]) {
                    maxEl = j;
                }
                if (array[j] < array[minEl]) {
                    minEl = j;
                }

            }
            System.out.println("\nMax element = " + array[maxEl] + "\nMin element = " + array[minEl]);
            exchangeEl = array[maxEl];
            array[maxEl] = array[minEl];
            array[minEl] = exchangeEl;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "; ");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
