package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_9 {
    //    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//    чисел несколько, то определить наименьшее из них.

    Random algRandom = new Random();

    public Task_9() {
        try {
            int n = 10; //algRandom.nextInt(20);
            int[] array = {2, 2, 2, 4, 1, 4, 4, 6, 3, 1};
            System.out.println("Sequence of numbers " + Arrays.toString(array));
            int counterLocal, variableLocal;
            int counterGlobal = 0;
            int variableGlobal = 0;
            for (int i = 0; i < array.length; i++) {
                variableLocal = array[i];
                counterLocal = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        counterLocal++;
                    }
                    if (counterLocal > counterGlobal) {
                        counterGlobal = counterLocal;
                        variableGlobal = array[i];
                        if (variableLocal < variableGlobal) {
                            variableGlobal = variableLocal;
                        }
                    }

                }
            }
            System.out.println("Most  common number  " + counterGlobal +
                    "\nMost common variable in sequence " + variableGlobal);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
