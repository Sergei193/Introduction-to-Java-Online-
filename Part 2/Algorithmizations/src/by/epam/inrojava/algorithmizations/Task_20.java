package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_20 {
    //10. Найти положительные элементы главной диагонали квадратной матрицы.
    Random algRandom = new Random();

    public Task_20() {
        try {
            int n = 6, m = 6;
            System.out.println("Square matrix " + n + "x" + m);
            int[][] squareMatrix = new int[n][m];
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = algRandom.nextInt(100) - 50;
                }
            }
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    System.out.print(squareMatrix[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println("Main diagonal of matrix");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    if (i == j) {
                        System.out.print(squareMatrix[i][j] + ", ");
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println("Positive elements of main diagonal    ");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    if (i == j) {
                        if (squareMatrix[i][j] > 0) {
                            System.out.print(squareMatrix[i][j] + ", ");
                        }
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
