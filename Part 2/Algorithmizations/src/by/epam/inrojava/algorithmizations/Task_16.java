package by.epam.inrojava.algorithmizations;

public class Task_16 {
    // 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public Task_16() {
        try {
            int n = 6;
            System.out.println("Square matrix " + n + "x" + n);
            int[][] squareMatrix = new int[n][n];
            for (int i = 0; i < squareMatrix.length; i++) {
                if (i <= 2) {
                    for (int j = i; j < squareMatrix[i].length - i; j++) {
                        squareMatrix[i][j] = 1;
                    }
                }//if (i > 2)
                else {
                    for (int j = squareMatrix[i].length-1 - i ; j <= i; j++) {
                        squareMatrix[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    System.out.print(squareMatrix[i][j] + ", ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
