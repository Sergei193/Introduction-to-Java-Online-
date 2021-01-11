package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_12 {
    ///  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    Random algRandom = new Random();

    public Task_12() {
        try {
            int n = 5, m = 5;//square
            System.out.println("Square matrix " + n + "x" + m);
            int[][] squareMatrix = new int[n][m];
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = algRandom.nextInt(100) - 50;
                    System.out.print(squareMatrix[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println("Diagonal elements");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    if (i == j) {
                        System.out.print(squareMatrix[i][j] + ",");
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
