package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_7 {
    //7. Даны действительные числа n a ,a , ,a 1 2  . Найти
//    max( a1 + a2n,a2 + a2n−1,....,an + an+1) .
    Random algRandom = new Random();

    public Task_7() {
        try {
            int summaMax = 0;
            int n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
            }
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length-1; i++) {
                for (int j = array.length-1; j > i; j--) {
                    summaMax += array[i] + array[j];
                }
            }
            System.out.println("Total summa = " + summaMax);
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }
}
