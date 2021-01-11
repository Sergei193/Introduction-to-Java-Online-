package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_23 {
    //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    Random algRandom = new Random();

    public Task_23() {
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
            System.out.println("Sorting ascending");
            boolean isSorting = false;
            int swap;
            for (int j = 0; j < matrixArray[0].length; j++) {
                isSorting = false;
                while (!isSorting) {
                    isSorting = true;
                    for (int i = 0; i < matrixArray.length - 1; i++) {
                        if (matrixArray[i][j] > matrixArray[i + 1][j]) {
                            swap = matrixArray[j][i];
                            matrixArray[i][j] = matrixArray[i + 1][j];
                            matrixArray[i + 1][j] = swap;
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
            System.out.println("Sorting descending");

            for (int j = 0; j < matrixArray[0].length; j++) {
                isSorting = false;
                while (!isSorting) {
                    isSorting = true;
                    for (int i = 0; i < matrixArray.length - 1; i++) {
                        if (matrixArray[i][j] < matrixArray[i + 1][j]) {
                            swap = matrixArray[j][i];
                            matrixArray[i][j] = matrixArray[i + 1][j];
                            matrixArray[i + 1][j] = swap;
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
