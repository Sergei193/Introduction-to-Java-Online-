package by.epam.inrojava.algorithmizations;

public class Task_31 {
    //    5. Сортировка вставками. Дана последовательность чисел a1,a2,a3,a4...aN.
//    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//    Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.
//    Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//    последовательность была тоже возрастающей.
//    Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//    Примечание. Место помещения очередного элемента в отсортированную часть производить
//    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
    int n = 10;
    int[] arraySequence = new int[n];

    public Task_31() {
        try {
            arraySequence = fillArray(n);
            showArray(arraySequence);
            System.out.println("\nСортировка вставками");
            sortInsertSequence(arraySequence);
            showArray(arraySequence);
        } catch (Exception e) {
            System.err.println(e.toString());
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

    private void sortInsertSequence(int[] array) throws Exception {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

}
