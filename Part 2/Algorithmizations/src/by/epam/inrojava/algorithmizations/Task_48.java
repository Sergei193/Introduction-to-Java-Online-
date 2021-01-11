package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_48 {
    //         14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,
// если  сумма  его  цифр,  возведенная в степень  n, равна  самому  числу.
// Найти  все  числа Армстронга  от  1 до  k.
//        Для решения  задачи  использовать декомпозицию.
    Scanner algScanner = new Scanner(System.in);

    public Task_48() {
        try {
            System.out.println("Enter number k ");
            int k = algScanner.nextInt();
            printArmstrongNumbers(k);
        } catch (Exception e) {
            System.err.println(e.toString());
        }


    }

    private void printArmstrongNumbers(int k) throws Exception {
        for (int i = 1; i <= k; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isArmstrong(int number) throws Exception {
        int sum = 0;

        int[] array = new int[lengthNumber(number)];
        int n = number;
        for (int i = array.length; i > 0; i--) {
            array[i - 1] = n - (n / 10) * 10;
            n /= 10;
        }
        for (int element : array) {
            int inDegree = element;
            for (int j = 1; j < array.length; j++) {
                inDegree *= element;
            }
            sum += inDegree;
        }
        return number == sum;
    }

    private int lengthNumber(int number) throws Exception {
        int length = 0;
        while (number > 1) {
            number /= 10;
            length++;
        }

        return length;
    }
}
