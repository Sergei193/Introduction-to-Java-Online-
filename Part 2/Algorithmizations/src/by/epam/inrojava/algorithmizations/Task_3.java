package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

//    Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
//     положительных и нулевых элементов.
public class Task_3 {
    Scanner algScaner = new Scanner(System.in);
    Random algRandom = new Random();

    public Task_3() {
        try {
            int n = 0, countNegativeEl =0 , countPositiveEl = 0, countZeroEl = 0;
            n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            System.out.println(" Size of array are " + n + " elements");
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
                System.out.print(array[i] + "; ");
                if (array[i]>0) {
                    countPositiveEl++;
                } else if (array[i]<0) {
                    countNegativeEl++;
                } else {
                    countZeroEl++;
                }
            }
            System.out.println ("\nNumber of positive elements = " + countPositiveEl + "\nnumber of negative elements = "
                            + countNegativeEl + "\nNumber of zero elements = " + countZeroEl );

        } catch (Exception e) {
            System.err.println(e.toString());
        }


    }
}
