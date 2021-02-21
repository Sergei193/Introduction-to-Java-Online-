public class Test_1 {
    //        01. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//    наибольшее значение из этих двух переменных.
    private int a = 5;
    private int b = 12;

    public Test_1() {
        try {
            showVariables(a, b);
            a = changeVariable(a);
            b = changeVariable(b);
            System.out.println("Variable after change");
            showVariables(a, b);
            summaVariables(a, b);
            System.out.println("Bigger of variable  = " + maxVariable(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showVariables(int a, int b) throws Exception {
        System.out.println("Variable a = " + a + "\nVariable b = " + b);
    }

    private int changeVariable(int a) throws Exception {
        a += (int) (Math.random() * 100) + 1;
        return a;
    }

    private void summaVariables(int a, int b) throws Exception {
        int summa = 0;
        summa = a + b;
        System.out.println("Summa variables = " + summa);
    }

    private int maxVariable(int a, int b) throws Exception {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
}
