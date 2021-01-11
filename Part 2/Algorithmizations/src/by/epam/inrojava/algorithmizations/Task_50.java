package by.epam.inrojava.algorithmizations;

public class Task_50 {
    //      16.  Написать программу, определяющую сумму n - значных чисел, содержащих только
//        нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
//        решения задачи использовать декомпозицию.
    public Task_50() {
        try {
            int n = 6;
            int sum = calculateSum(n);
            int evenNumbers = countEvenNumbers(sum);
            System.out.printf("Sum %d numbers, consists even numbers: %d %n", n, sum);
            System.out.printf("In founded sum %d even numbers", evenNumbers);
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private static int calculateSum(int n) throws Exception {
        int[] numbers = findNumbers(n);
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    private static int[] findNumbers(int n) throws Exception {
        int size = (int) Math.pow(5, n);
        int[] numbers = new int[size];
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        numbers[0] = firstNumber;

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = nextNumber(numbers[i - 1], n);
        }
        return numbers;
    }

    private static int nextNumber(int number, int n) throws Exception {
        boolean isNext = false;
        while (!isNext) {
            number += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return number;
    }

    private static int countEvenNumbers(int n) throws Exception {
        int rest;
        int count = 0;
        while (n != 0) {
            rest = n % 10;
            n = n / 10;
            if (rest % 2 == 0)
                count++;
        }
        return count;
    }
}
