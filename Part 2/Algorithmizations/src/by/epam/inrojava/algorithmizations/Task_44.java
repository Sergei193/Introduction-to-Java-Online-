package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_44 {
    //    10. Дано натуральное число N. Написать метод(методы) для формирования массива,
//    элементами которого являются цифры числа N
    int n = 23;
    int[] array;

    public Task_44() {

        try {
            createArray(n);
            Arrays.toString(array);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void createArray(int n) throws Exception {
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            System.out.println(", " + array[i]);
        }
    }

}
