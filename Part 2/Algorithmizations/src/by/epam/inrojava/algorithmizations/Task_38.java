package by.epam.inrojava.algorithmizations;

import java.util.Arrays;

public class Task_38 {
    //   4. На плоскости заданы своими координатами  n точек.
//      Написать метод(методы), определяющие, между какими  из пар точек самое большое расстояние.
//    Указание. Координаты точек занести в массив.
    int n = 10;
    double[] x;
    double[] y;

    public Task_38() {
        try {
            createPlane(n);
            showArray(x, y);
            int[] points = getMaxDistanceIndex(x, y);
            System.out.println("Max distance between : " + Arrays.toString(points));
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private void createPlane(int n) throws Exception {
        x = new double[n];
        y = new double[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10000) / 100.;
        }
        for (int j = 0; j < y.length; j++) {
            y[j] = (int) (Math.random() * 10000) / 100.;
        }
    }

    private void showArray(double[] x, double[] y) throws Exception {
        for (int i = 0; i < x.length; i++) {
            System.out.println("X" + (i + 1) + "=" + x[i] + ", " + "Y" + (i + 1) + "=" + x[i]);
        }
    }

    private int[] getMaxDistanceIndex(double[] x, double[] y) throws Exception {
        double maxDistance = Double.MIN_VALUE;
        int maxPoint_1 = 0, maxPoint_2 = 0;
        for (int i = 1; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                double d = getDistance(x[i], y[i], x[j], y[j]);
                if (d > maxDistance) {
                    maxDistance = d;
                    maxPoint_1 = i;
                    maxPoint_2 = j;
                }
            }
        }
        return new int[]{maxPoint_1, maxPoint_2};
    }

    private double getDistance(double x1, double y1, double x2, double y2) throws Exception {
        double x = Math.abs(x1 - x2);
        double y = Math.abs(y1 - y2);
        return Math.abs(x + y);
    }
}
