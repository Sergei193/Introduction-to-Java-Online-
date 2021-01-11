package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_19 {

    //    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//    столбец содержит максимальную сумму.
    Random algRandom = new Random();

    public Task_19() {
        try {
            int n = 6, m = 5;
            System.out.println("Give matrix " + n + "x" + m);
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(100 - 1);
                }
            }
            System.out.println("Matrix");
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + ", ");
                }
                System.out.println();
            }
            int summaElementColumn;
            int maxSummaElements = 0;
            int numberColumn = 0;
            for (int i = 0; i < matrixArray.length; i++) {
                summaElementColumn = 0;
                for (int j = 0; j < matrixArray[i].length; j++) {
                    summaElementColumn += matrixArray[i][j];
                    if (summaElementColumn > maxSummaElements) {
                        maxSummaElements = summaElementColumn;
                        numberColumn = (j + 1);
                    }
                }
            }
            System.out.println("Maxim summa of elements " + maxSummaElements + " column " + numberColumn);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
