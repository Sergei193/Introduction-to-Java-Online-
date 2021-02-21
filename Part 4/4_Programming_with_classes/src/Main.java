import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try {
            //        01. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//        переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//        наибольшее значение из этих двух переменных.
//        Test_1 test_1 = new Test_1();
//        02. Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
//    конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//    класса.
//        Test_2 test_2 = new Test_2(5, 10);
//        03. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//                из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//        номеров групп студентов, имеющих оценки, равные только 9 или 10.
//        Task_3 task_3 = new Task_3();
//       04.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//    Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//    номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//    Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//    назначения должны быть упорядочены по времени отправления.
//            Train[] trains = new Train[5];
//            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//            trains[0] = new Train("Minsk", 1, formatter.parse("01-02-2020"));
//            trains[1] = new Train("Minsk", 11, formatter.parse("01-01-2020"));
//            trains[2] = new Train("Mogilev", 2, formatter.parse("01-03-2020"));
//            trains[3] = new Train("Grodno", 3, formatter.parse("01-04-2020"));
//            trains[4] = new Train("Gomel", 4, formatter.parse("01-05-2020"));
//            Train.showTrain(trains);
//            System.out.println("================");
//            int requestByNumberTrain = 2;//
//            Train.informationOfTrain(trains, requestByNumberTrain);//Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//            System.out.println("================");
//            Train.sortTrainOfNumber(trains);
//            Train.showTrain(trains);
//            System.out.println("===================");
//            Train.sortTrainOfDestination(trains);
//            System.out.println("===================");
//            Train.showTrain(trains);
// 5.Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод,
//позволяющий получить его текущее состояние.
            Counter counter = new Counter();
            System.out.println("Counter was create - >  " + "bottom = " + counter.getBottomCounter() +
                    " top = " + counter.getTopCounter() + " current state = " + counter.getCurrentPosition());
            System.out.println("Changing the state");
            counter.changeCounter(20, 40, 1);
            System.out.println("Counter is " + "bottom = " + counter.getBottomCounter() + " top = "
                    + counter.getTopCounter() + " current state = " + counter.getCurrentPosition());
            System.out.println("Increase the state");
            counter.increase(counter.getBottomCounter(), counter.getTopCounter());
            System.out.println("Changing the state");
            counter.changeCounter(15, 25, 1);
            System.out.println("Counter is " + "bottom = " + counter.getBottomCounter() + " top = "
                    + counter.getTopCounter() + " current state = " + counter.getCurrentPosition());
            System.out.println("Reduce the state");
            counter.reduce(counter.getBottomCounter(), counter.getTopCounter());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
