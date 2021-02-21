public class Counter {
    // 5.Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод,
//позволяющий получить его текущее состояние.
    private int currentPosition;
    private int topCounter;
    private int bottomCounter;

    protected Counter() throws Exception {
        this.topCounter = 10;
        this.bottomCounter = 1;
        this.currentPosition = 1;
    }

    protected void changeCounter(int min, int max, int current) throws Exception {
        if (min < max && current == 1) {
            setBottomCounter(min);
            setTopCounter(max);
            setCurrentPosition(current);
        } else if (min > max && current != 1) {
            System.out.println("Min must be more than max and value is allowing in 1 ");
        }


    }

    protected void showStateCounter() {
        System.out.println("Current state counter - > " + getCurrentPosition());
    }

    protected void reduce(int min, int max) throws Exception {

        if (min >= getBottomCounter() && max <= getTopCounter()) {
            for (int i = max; i >= min; i--) {
                setCurrentPosition(i);
                showStateCounter();
            }
        } else {
            System.out.println("The value can not be less than" + getBottomCounter() + " and more than " + getTopCounter());
        }
    }

    protected void increase(int min, int max) throws Exception {

        if (min >= getBottomCounter() && max <= getTopCounter()) {
            for (int i = min; i <= max; i++) {
                setCurrentPosition(i);
                showStateCounter();
            }
        } else {
            System.out.println("The value can not be less than" + getBottomCounter() + " and more than " + getTopCounter());
        }
    }

    /////=============================
    protected int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getBottomCounter() {
        return bottomCounter;
    }

    public int getTopCounter() {
        return topCounter;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setTopCounter(int topCounter) {
        this.topCounter = topCounter;
    }

    public void setBottomCounter(int bottomCounter) {
        this.bottomCounter = bottomCounter;
    }

}
