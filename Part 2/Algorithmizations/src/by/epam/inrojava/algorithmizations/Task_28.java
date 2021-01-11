package by.epam.inrojava.algorithmizations;

public class Task_28 {
//    2.Даны две последовательности a1<=a2<=a3<=aN и b1<=b2<=b3<=bM. Образовать из них новую последовательность
//    чисел так, чтобы она тоже была неубывающей.

    public Task_28() {
        try {
            int[] a = {1, 10, 20, 30, 40, 50};
            int[] b = {5, 15, 25, 35, 45, 55};
            int[] c = new int[a.length + b.length];
            for (int i = 0; i < c.length; i++) {
                if (i < a.length) {
                    c[i] = a[i];
                } else {
                    c[i] = b[i - a.length];
                }

            }
            for (int i = 1; i < c.length - 1; i++) {

                for (int j = 0; j < i; j++) {
                    if (c[j] > c[j + 1]) {
                        int temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                }
            }
            System.out.println("Seq C: ");
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + "  ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}
