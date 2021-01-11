package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_8 {
    //   8. Дана последовательность целых чисел a1, a2, …an.
//    Образовать новую последовательность, выбросив из исходной, те члены, которые равны min(a1, a2, …an)
    Random algRandom = new Random();

    public Task_8() {
        try {
            int n = 10;
            int minF = algRandom.nextInt(50) - 10;
            int countMin = 0, countMoreMin = 0;
            int[] arrayStart = new int[n];
            System.out.println("Number of elements array = " + n);
            System.out.println("Minimum value of function = " + minF);
            for (int i = 0; i < arrayStart.length; i++) {
                arrayStart[i] = algRandom.nextInt(100) - 50;
            }
            System.out.println("The old sequence = " + Arrays.toString(arrayStart));
            for (int i = 0; i < arrayStart.length; i++) {
                if (arrayStart[i] < minF) {
                    countMin++;
                } else {
                    countMoreMin++;
                }
            }
            int[] arrayMin = new int[countMin];
            int[] arrayMoreMin = new int[countMoreMin];
            int localCounter_1 = 0, localCounter_2 = 0;
            for (int i = 0; i < arrayStart.length; i++) {
                if (arrayStart[i] < minF) {
                    arrayMin[localCounter_1] = arrayStart[i];
                    localCounter_1++;

                } else {
                    arrayMoreMin[localCounter_2] = arrayStart[i];
                    localCounter_2++;
                }
            }
            System.out.println("The new sequence = " + Arrays.toString(arrayMoreMin));
            System.out.println("The sequence min(a1, a2, …an) = " + Arrays.toString(arrayMin));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
