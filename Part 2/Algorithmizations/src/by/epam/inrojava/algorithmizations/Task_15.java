package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_15 {
    //5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    Random algRandom = new Random();
    Scanner scanner = new Scanner(System.in);

    public Task_15() {
        try {
            int n = 6;
            System.out.println("Size of square matrix " + n + "x" + n);
            int[][] squareMatrix = new int[n][n];
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = (i + 1);
                }
            }
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = squareMatrix[i].length - i; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = 0;
                }
            }
            System.out.println("Formed matrix");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    System.out.print(squareMatrix[i][j] + ", ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
