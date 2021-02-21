package Task_5_B;

public class Candy {
    private String nameCandy;
    private int countCandy;

    public Candy(String nameCandy, int countCandy) {
        this.nameCandy = nameCandy;
        this.countCandy = countCandy;
    }

    public String getNameCandy() {
        return nameCandy;
    }

    public void setNameCandy(String nameCandy) {
        this.nameCandy = nameCandy;
    }

    public int getCountCandy() {
        return countCandy;
    }

    public void setCountCandy(int countCandy) {
        this.countCandy = countCandy;
    }

    @Override
    public String toString() {
        return String.format("Candy : %s, countCandy : %d ", getNameCandy(), getCountCandy());
    }
}
