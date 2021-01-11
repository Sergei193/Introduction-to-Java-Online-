package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_45 {
    //        11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    Scanner algScanner = new Scanner(System.in);

    public Task_45() {
        try {
            long first = 0, second = 0;
            System.out.println("Enter first number");
            first = algScanner.nextLong();
            System.out.println("Enter second number");
            second = algScanner.nextLong();
            compereNumbers(first, second);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void compereNumbers(long first, long second) throws Exception {
        first = getCountsOfDigits(first);
        second = getCountsOfDigits(second);
        if (first > second) {
            System.out.println("in first number is longer than second number ");
            System.out.println("The first number of digits" + first + " second  number of digits" + second);

        } else {
            System.out.println("in second number is longer than first number ");
            System.out.println("The first number of digits" + first + " second  number of digits" + second);
        }
    }

    private int getCountsOfDigits(long number) throws Exception {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
