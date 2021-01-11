package by.epam.inrojava.algorithmizations;

import java.util.Scanner;

public class Task_49 {
    // 15.  Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго
// возрастающую  последовательность (например, 1234, 5789).
// Для решения задачи использовать декомпозицию.
    Scanner algScanner = new Scanner(System.in);

    public Task_49() {
        try {
            findNumbers(2);
            findNumbers(3);
            findNumbers(4);
            findNumbers(5);
            findNumbers(6);
            findNumbers(7);
            findNumbers(8);
            findNumbers(9);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void findNumbers(int n) throws Exception {
        int[] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b");
    }

}
