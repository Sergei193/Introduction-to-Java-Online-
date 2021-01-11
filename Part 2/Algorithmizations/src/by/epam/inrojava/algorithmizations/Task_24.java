package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_24 {
    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
    Random algRandom = new Random();

    public Task_24() {
        try {
            boolean isFormed = true;
            int n = 0, m = 0;
            while (isFormed) {
                n = algRandom.nextInt(10);
                m = algRandom.nextInt(10);
                if (n > m && n > 0 && m > 0) {
                    isFormed = false;
                }
            }
            int[][] matrixArray = new int[n][m];
            System.out.println("Matrix " + n + "x" + m);
            for (int i = 0; i < matrixArray.length; i++) {
                int countUnits = i + 1;
                for (int j = 0; j < matrixArray[i].length; j++) {
                    if (countUnits - 1 > 0) {
                        matrixArray[i][j] = 0;
                        countUnits--;
                    } else {
                        matrixArray[i][j] = 1;
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
