package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_29 {
//    Cортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,
//    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//    повторяется. Написать алгоритм сортировки выбором.

    public Task_29() {
        try {
            int[] a = new int[]{-50, -40, -30, -20, -10, 0, 10, 20, 30, 40, 50};
            System.out.println("Given sequence " + Arrays.toString(a));
            int maxElement, swap;
            for (int i = 0; i < a.length; i++) {
                maxElement = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > a[maxElement]) {
                        maxElement = j;
                    }
                    swap = a[maxElement];
                    a[maxElement] = a[i];
                    a[i] = swap;
                }
            }
            System.out.println("Cортировка выбором");
            System.out.println(Arrays.toString(a));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
