package Task_5_A;

public class Flowers {
    private String nameFlower;
    private int countFlowers;

    public Flowers(String nameFlower, int countFlowers) {
        this.nameFlower = nameFlower;
        this.countFlowers = countFlowers;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public int getCountFlowers() {
        return countFlowers;
    }

    public void setCountFlowers(int countFlowers) {
        this.countFlowers = countFlowers;
    }

    @Override
    public String toString() {
        return String.format("Flowers : %s, count flowers in compositions : %d", getNameFlower(), getCountFlowers());
    }

}
