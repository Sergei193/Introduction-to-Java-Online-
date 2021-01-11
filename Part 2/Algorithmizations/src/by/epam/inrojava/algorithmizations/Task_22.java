package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_22 {
    // 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    Random algRandom = new Random();

    public Task_22() {
        try {
            int n = 6, m = 5;
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(100) - 50;
                }
            }
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + ", ");
                }
                System.out.println();
            }
            int sawp;
            boolean isSorting = false;
            System.out.println("Sorted ascending");
            for (int i = 0; i < matrixArray.length; i++) {
                isSorting = false;
                while (!isSorting) {
                    isSorting = true;
                    for (int j = 0; j < matrixArray[i].length - 1; j++) {
                        if (matrixArray[i][j] > matrixArray[i][j + 1]) {
                            sawp = matrixArray[i][j];
                            matrixArray[i][j] = matrixArray[i][j + 1];
                            matrixArray[i][j + 1] = sawp;
                            isSorting = false;
                        }
                    }

                }

            }
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println("Sorted descending");
            for (int i = 0; i < matrixArray.length; i++) {
                isSorting = false;
                while (!isSorting) {
                    isSorting = true;
                    for (int j = 0; j < matrixArray[i].length - 1; j++) {
                        if (matrixArray[i][j] < matrixArray[i][j + 1]) {
                            sawp = matrixArray[i][j];
                            matrixArray[i][j] = matrixArray[i][j + 1];
                            matrixArray[i][j + 1] = sawp;
                            isSorting = false;
                        }
                    }

                }
            }
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + ", ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
