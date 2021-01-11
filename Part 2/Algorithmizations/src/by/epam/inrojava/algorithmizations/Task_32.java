package by.epam.inrojava.algorithmizations;

public class Task_32 {
    //6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
// его по возрастанию. Делается это следующим образом: сравниваются два сосед-
// них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
//  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
// тся на один элемент назад. Составить алгоритм этой сортировки.
    int n = 10;
    int[] arraySequence = new int[n];

    public Task_32() {
        try {
            arraySequence = fillArray(n);
            showArray(arraySequence);
            System.out.println("\nСортировка Шелла");
            sortSell(arraySequence);
            showArray(arraySequence);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private int[] fillArray(int n) throws Exception {
        for (int i = 0; i < arraySequence.length; i++) {
            arraySequence[i] = (int) (Math.random() * 100) - 50;
        }
        return arraySequence;
    }

    private void showArray(int[] arraySequence) throws Exception {
        for (int i = 0; i < arraySequence.length; i++) {
            System.out.print(arraySequence[i] + ", ");
        }
    }

    private void sortSell(int[] arraySequence) throws Exception {
        int i = 1;
        int temp;
        while (i < arraySequence.length) {
            if (arraySequence[i - 1] > arraySequence[i]) {
                temp = arraySequence[i - 1];
                arraySequence[i - 1] = arraySequence[i];
                arraySequence[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }

            } else {
                i++;
            }

        }
    }
}
