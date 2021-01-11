package by.epam.inrojava.algorithmizations;

import java.util.Random;
import java.util.Scanner;

public class Task_18 {
    //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//    пользователь с клавиатуры
    Scanner scanner = new Scanner(System.in);
    Random algRandom = new Random();

    public Task_18() {
        try {
            int n = 6, m = 5;
            System.out.println("Matrix " + n + "x" + m);
            int[][] matrixArray = new int[n][m];
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    matrixArray[i][j] = algRandom.nextInt(100) - 50;
                }
            }
            System.out.println("Formed matrix");
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + " , ");
                }
                System.out.println();
            }
            int column_1, column_2;
            System.out.println("Enter number of columns for replace");
            column_1 = scanner.nextInt() - 1;
            column_2 = scanner.nextInt() - 1;
            int tempVariable = 0;
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    tempVariable = matrixArray[i][column_1];
                    matrixArray[i][column_1]=matrixArray[i][column_2];
                    matrixArray[i][column_2]=tempVariable;
                }
            }
            System.out.println("Matrix after replaced");
            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[i].length; j++) {
                    System.out.print(matrixArray[i][j] + " , ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
