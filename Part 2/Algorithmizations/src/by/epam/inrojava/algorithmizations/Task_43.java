package by.epam.inrojava.algorithmizations;

import java.text.DecimalFormat;

public class Task_43 {
    //    9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//    вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    double x, y, z, t;
    DecimalFormat df = new DecimalFormat("####.###");

    public Task_43() {
        try {
            double square = 0;
            x = Math.random() * 100;
            y = Math.random() * 100;
            z = Math.random() * 100;
            t = Math.random() * 100;
            System.out.println("X = " + df.format(x));
            System.out.println("Y = " + df.format(y));
            System.out.println("Z = " + df.format(z));
            System.out.println("T = " + df.format(t));
            square = calculateSquare(x, y, z, t);
            System.out.println("The area of quadrangle  = " + df.format(square));


        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private double calculateSquare(double x, double y, double z, double t) throws Exception {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
}
