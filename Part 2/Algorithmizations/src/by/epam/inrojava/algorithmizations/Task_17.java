package by.epam.inrojava.algorithmizations;

public class Task_17 {
    //7. Сформировать квадратную матрицу порядка N по правилу:
    // A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов
    public Task_17() {
        try {
            int n = 6;
            System.out.println("Square matrix " + n + "x" + n);
            double[][] squareMatrix = new double[n][n];
            int counter = 0;
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / squareMatrix.length);
                    if (squareMatrix[i][j] > 0) {
                        counter++;
                    }
                }
            }
            System.out.println("Formed matrix");
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    System.out.print(squareMatrix[i][j] + " , ");
                }
                System.out.println();
            }
            System.out.println("Count of positive elements = " + counter);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
