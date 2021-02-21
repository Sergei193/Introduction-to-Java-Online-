import java.util.Arrays;

public class Task_3 {
    //        03. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//                из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//        номеров групп студентов, имеющих оценки, равные только 9 или 10.
    Student[] students;

    public Task_3() {
        students = new Student[10];
        students[0] = new Student("Иванов И.И.", 11, new int[]{9, 7, 9, 6, 9});
        students[1] = new Student("Петров П.И.", 11, new int[]{9, 9, 10, 9, 10});
        students[2] = new Student("Сидоров К.И.", 22, new int[]{5, 6, 7, 9, 8});
        students[3] = new Student("Кузьмич В.И.", 22, new int[]{10, 10, 9, 10, 10});
        students[4] = new Student("Петрович П.И.", 33, new int[]{8, 9, 7, 9, 8});
        students[5] = new Student("Дмитриев Н.И.", 11, new int[]{9, 7, 9, 6, 9});
        students[6] = new Student("Романов А.И.", 33, new int[]{9, 9, 10, 9, 10});
        students[7] = new Student("Наливойко В.И.", 11, new int[]{5, 6, 7, 9, 8});
        students[8] = new Student("Кузьменков В.И.", 22, new int[]{10, 10, 10, 9, 10});
        students[9] = new Student("Казаков П.И.", 33, new int[]{5, 6, 7, 9, 8});
        System.out.println("Students");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("Students who have grades no lower than 9 and 10 ");
        Student.showBetterStudents(students);
    }


    private static class Student {
        private String surname;
        private int numberGroup;
        private int[] grads;

        private Student(String surname, int numberGroup, int[] grads) {
            this.surname = surname;
            this.numberGroup = numberGroup;
            this.grads = grads;
        }

        private static void showBetterStudents(Student[] students) {

            for (Student student : students) {
                int minMark = 10;
                for (int i = 0; i < student.getGrads().length; i++) {
                    if (student.getGrads()[i] < minMark) {
                        minMark = student.getGrads()[i];
                    }
                }
                if (minMark >= 9) {
                    System.out.println(student.toString());
                }

            }
        }

        public int[] getGrads() {
            return grads;
        }

        @Override
        public String toString() {
            return "Student -> " + "surname = " + surname + ", numberGroup = " + numberGroup +
                    ", grads = " + Arrays.toString(grads);
        }
    }
}
