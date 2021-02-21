public class Test_2 {
    //        02. Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
//    конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//    класса.
    private int a;
    private int b;

    public Test_2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int getA() {
        return a;
    }

    private int getB() {
        return b;
    }

    private void setA(int a) {
        this.a = a;
    }

    private void setB(int b) {
        this.b = b;
    }
}
