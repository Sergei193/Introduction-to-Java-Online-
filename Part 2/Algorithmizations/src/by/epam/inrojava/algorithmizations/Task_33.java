package by.epam.inrojava.algorithmizations;

public class Task_33 {
    // 7.  Пусть даны две неубывающие последовательности действительных
//чисел  a1 <= a2 <= ... <= an и b1 <= b2 <= ... <=bm .
//Требуется указать те места, на которые нужно вставлять элементы
//последовательности b1 <= b2 <= ... <=bm в первую  последовательность так,
//чтобы новая последовательность оставалась возрастающей.
    int n = 10, m = 12;
    int[] sequenceA;
    int[] sequenceB;
    int[] sequenceAB;

    public Task_33() {
        try {
            System.out.println("Sequence A");
            sequenceA = createSequence(n);
            showArray(sequenceA);
            System.out.println("\nSequence B");
            sequenceB = createSequence(m);
            showArray(sequenceB);
            createNewSequence(sequenceA, sequenceB);

        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private int[] createSequence(int n) throws Exception {
        int[] array = new int[n];
        int step = (int) (Math.random() * 10);
        for (int i = 0; i < array.length; i++) {
            array[i] = i + step;
        }
        return array;
    }

    private void showArray(int[] array) throws Exception {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private int insertSequence(int[] array, int element) throws Exception {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;

    }

    private void createNewSequence(int[] sequenceB, int[] sequenceA) throws Exception {
        for (int element : sequenceB) {
            int pointInsert = insertSequence(sequenceA, element);
            int[] arrayTemp = new int[sequenceA.length + 1];
            for (int i = 0; i < sequenceA.length; i++) {
                if (pointInsert > i) {
                    arrayTemp[i] = sequenceA[i];
                } else if (pointInsert == i) {
                    arrayTemp[i] = element;
                    arrayTemp[i + 1] = sequenceA[i];
                } else {
                    arrayTemp[i + 1] = sequenceA[i];
                }
            }
            sequenceAB = arrayTemp;
            System.out.printf("%n%nPoint insert a new elements \"%d\": i = %d", element, pointInsert);
            System.out.println("\nNew sequence:");
            showArray(sequenceAB);
        }
    }
}
