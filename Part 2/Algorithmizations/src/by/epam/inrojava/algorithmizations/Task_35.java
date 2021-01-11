package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_35 {
    //          Написать метод(методы) для нахождения наибольшего общего делителя и
//          наименьшего общего кратного двух натуральных чисел:НОК(А,В) = A*B / НОД(A,B)

    public Task_35() {
        Scanner algScanner = new Scanner(System.in);
        System.out.println("Enter value a & b ");
        int a = algScanner.nextInt();
        int b = algScanner.nextInt();
        ;
        int gcd = findGcd(a, b);
        System.out.println("Largest Common Factor: " + gcd);
        int lcm = findLcm(a, b);
        System.out.println("Least Common Multiple : " + lcm);
    }

    private int findGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < 2; i++) {
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

    private int findLcm(int a, int b) {
        return Math.abs(a * b / findGcd(a, b));
    }

}
