package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_14 {
    // 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    Random algRandom = new Random();
    Scanner scanner = new Scanner(System.in);

    public Task_14() {
        try {
            int n = 6;
            System.out.println("Enter size of square matrix " + n);
//            n = scanner.nextInt();
            int[][] squareMatrix = new int[n][n];
            System.out.println("Square matrix");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = (j + 1);
                    System.out.print(squareMatrix[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println("Formed matrix");
            for (int i = 0; i < squareMatrix.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < squareMatrix[i].length; j++) {
                        System.out.print(squareMatrix[i][j] + ", ");
                    }
                } else {
                    for (int j = squareMatrix[i].length - 1; j >= 0; j--) {
                        System.out.print(squareMatrix[i][j] + ", ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
