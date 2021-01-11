package by.epam.inrojava.algorithmizations;

import java.util.Random;

public class Task_21 {
    //    11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//    которых число 5 встречается три и более раз.
    Random algRandom = new Random();

    public Task_21() {
        try {
            int n = 10, m = 20;
            int number = 5;
            System.out.println("Matrix " + n + "x" + m);
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(15 - 0);
                }
            }
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + ", ");
                }
                System.out.println();
            }
            System.out.println(" Number line");
            for (int i = 0; i < matrixArray.length; i++) {
                int count = 0;
                for (int j = 0; j < matrixArray[i].length; j++) {
                    if (matrixArray[i][j] == number) {
                        count++;
                    }
                }
                if (count >= 3) {
                    System.out.println("in line № " + (i + 1) + " number " + number + " repeats  3 and more times");
                } else {
                    System.out.println("in line № " + (i + 1) + " number " + number + " repeats less than 3 times");
                }
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
