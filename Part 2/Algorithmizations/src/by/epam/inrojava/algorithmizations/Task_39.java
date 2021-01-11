package by.epam.inrojava.algorithmizations;

public class Task_39 {
    //    Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//     которое меньше максимального элемента массива, но больше всех других элементов).
    int n = 10;
    int[] array;

    public Task_39() {
        try {
            System.out.println("Array");
            array = createArray(n);
            showArray(array);
            sortingArray(array);
            System.out.println("Array after sorting \n");
            showArray(array);

        } catch (Exception e) {
            System.err.println(e.toString());
        }


    }

    private int[] createArray(int n) throws Exception {
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) - 50);
        }
        return array;
    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private void sortingArray(int[] array) {
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;

                }
            }
        }
        System.out.println("Second largest number " + array[array.length - 2]+"\n");
    }
}
