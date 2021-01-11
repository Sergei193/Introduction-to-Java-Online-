package by.epam.inrojava.algorithmizations;

import java.util.Arrays;
import java.util.Random;

public class Task_10 {
    //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    Random algRandom = new Random();

    public Task_10() {
        try {
            int n = 10;//algRandom.nextInt(20-10);
            System.out.println("Number of elements in array = " + n);
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = algRandom.nextInt(100) - 50;
            }
            System.out.println("Array " + Arrays.toString(array));
            System.out.println("Array after compression ");
            for (int i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + ", ");
            }
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    array[i] = 0;
                }
            }
            System.out.println("\nThe array after replaced " + Arrays.toString(array));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
