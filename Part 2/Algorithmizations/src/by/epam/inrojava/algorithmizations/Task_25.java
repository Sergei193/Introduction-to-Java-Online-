package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_25 {
    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    Random algRandom = new Random();

    public Task_25() {

        try {
            boolean isFormed = true;
            int n = 0, m = 0;

            while (isFormed) {
                n = algRandom.nextInt(10);
                m = algRandom.nextInt(10);
                if (n > m && n > 3 && m > 3) {
                    isFormed = false;
                }
            }
            System.out.println("Matrix " + n + "x" + m);
            int[][] matrixArray = creatingMatrix(n, m);
            showMatrix(matrixArray);
            int max = searchMaxElements(matrixArray);
            System.out.println("Maximum elements of array " + max);
            System.out.println("Array after replaced");
            replaceElements(matrixArray, max);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private int[][] creatingMatrix(int n, int m) throws Exception {
        int[][] matrixArray = new int[n][m];
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrixArray;
    }

    private void showMatrix(int[][] matrixArray) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private int searchMaxElements(int[][] matrixArray) throws Exception {
        int max = 0;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (matrixArray[i][j] > max) {
                    max = matrixArray[i][j];
                }
            }
        }
        return max;
    }

    private void replaceElements(int[][] matrixArray, int maxElement) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (matrixArray[i][j] % 2 != 0) {
                    matrixArray[i][j] = maxElement;
                }
            }
        }
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
