package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_13 {
    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    Random algRandom = new Random();
    Scanner scanner = new Scanner(System.in);

    public Task_13() {
        try {
            int n = 0, m = 0;
            System.out.println("Enter size of matrix ");
            System.out.print("n = ");
            n = scanner.nextInt();
            System.out.print("m = ");
            m = scanner.nextInt();
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(100) - 50;
                    System.out.print(matrixArray[i][j] + " , ");
                }
                System.out.println();
            }
            System.out.println("Enter number of line");
            int k = scanner.nextInt();
            System.out.println("Enter number of columns");
            int p = scanner.nextInt();
            System.out.println(k + " line ");
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    if (i == (k - 1)) {
                        System.out.print(matrixArray[i][j] + " , ");
                    }
                }
            }
            System.out.println("\n" + p + " columns");
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    if (j == (p - 1)) {
                        System.out.println(matrixArray[i][j] + " , ");
                    }
                }
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
