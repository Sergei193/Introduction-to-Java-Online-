package by.epam.inrojava.algorithmizations;

public class Task_37 {
    //   3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
//   используя  метод  вычисления  площади  треугольника.
    public Task_37() {
        try {
            System.out.println("Area of hexagon with side 5: " + getHexagonArea(5) + " (64.95)");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    private double getHexagonArea(double a) throws Exception {
        return getTriangleArea(a) * 6;
    }

    private double getTriangleArea(double a) throws Exception {
        return Math.sqrt(3) / 4 * a * a;
    }
}
