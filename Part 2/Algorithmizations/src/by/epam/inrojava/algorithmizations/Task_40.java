package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_40 {
    //        6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public Task_40() {
        try {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int c = (int) (Math.random() * 100);
            int[] array = {a, b, c};
            System.out.println("Given numbers " + Arrays.toString(array));
            System.out.println("Numbers is mutually number prime " + isMutually(array));

        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private int findGcd(int[] number) throws Exception {
        int a = Math.abs(number[0]);
        for (int element : number) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

    private boolean isMutually(int[] a) throws Exception {
        return findGcd(a) == 1;
    }
}
