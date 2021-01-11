package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_11 {
    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

    Random algRandom = new Random();

    public Task_11() {
        try {
            int n, m = 0;
            n = 6;//algRandom.nextInt(10 + 5);
            m = 5;//algRandom.nextInt(10 + 5);
            System.out.println("Matrix " + n + "x" + m);
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(100) - 50;
                    System.out.print(matrixArray[i][j] + " , ");
                }
                System.out.println();
            }
            System.out.println(" Odd matrix columns");//&& matrixArray[0][j] > matrixArray[matrixArray[i].length-1][j]
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    if (j % 2 == 0 && (matrixArray[0][j] > matrixArray[matrixArray[i].length][j] )) {
                        System.out.print(matrixArray[i][j] + " , ");
                    }
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}
