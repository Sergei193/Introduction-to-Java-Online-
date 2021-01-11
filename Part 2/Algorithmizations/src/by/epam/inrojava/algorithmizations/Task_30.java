package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_30 {
//    4.Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
//    порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
//    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

    public Task_30() {
        try {
            int[] a = new int[]{-50, -40, -30, -20, -10, 0, 10, 20, 30, 40, 50};
            System.out.println("Given sequence " + Arrays.toString(a));
            int swap;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        swap = a[i];
                        a[i] = a[j];
                        a[j] = swap;

                    }
                }
            }
            System.out.println("Сортировка обменами " + Arrays.toString(a));

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }


}
