package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_6 {
    //    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//    являются простыми числами.
    Random algRandom = new Random();

    public Task_6() {
        try {
            int summa = 0;
            int n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
            }
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                    if (i > 1 && i % 1 % i == 0) {
                        summa += array[i];
                }


            }
            System.out.println("Summa of prime number = " + summa);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
