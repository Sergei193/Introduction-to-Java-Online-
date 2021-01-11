package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_5 {
    //5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
    Random algRandom = new Random();

    public Task_5() {
        try {
            int n = algRandom.nextInt(20 - 1);
            int[] array = new int[n];
            System.out.println("Number of elements = " + n);
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
            }
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                if (array[i] > i) {
                    System.out.print(array[i] + "; ");
                }
            }

    } catch(
    Exception e)

    {
        System.err.println(e.toString());
    }

}
}
