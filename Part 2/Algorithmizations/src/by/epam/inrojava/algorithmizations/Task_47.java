package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_47 {
    //    13. Два простых числа называются «близнецами», если они отличаются друг от друга
//    на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
//    n,2n], где n - заданное натуральное число больше 2. Для решения задачи
//    использовать декомпозицию.
    Scanner algScanner = new Scanner(System.in);
    int n = 0;

    protected Task_47() {
        try {
            System.out.println("Enter prime number n");
            n = algScanner.nextInt();
            printTwins(n);
        } catch (Exception e) {
            System.err.println(e.toString());
        }


    }


    private void printTwins(int n) throws Exception {
        if (n <= 2) {
            System.out.println("Number n must be greater 2");
        } else {
            int oldPrime = 0;
            for (int i = n; i <= 2 * n; i += 2) {
                if (oldPrime != 0) {
                    System.out.println("Twins: " + oldPrime + ", " + i);
                }
                oldPrime = i;
            }
        }
    }

}
