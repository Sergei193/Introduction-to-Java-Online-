package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_36 {
    //    2.Написать метод(методы) для нахождения наибольшего общего делителя четырех
//     натуральных чисел.
    int gcd;

    int[] number;

    public Task_36() {

        try {


            number = new int[]{2, 4, 6, 8};
            System.out.println("Sequence (4)" + Arrays.toString(number));
            gcd = findGcd(number);
            System.out.println("\nLargest Common Factor: " + gcd);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }


    private int findGcd(int[] array) throws Exception {
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

}
