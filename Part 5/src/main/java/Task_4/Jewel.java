package Task_4;

public class Jewel {
    private int jewelPrice;

    protected Jewel() {
        this.jewelPrice = (int) ((Math.random() * 100) + 1);
    }

    protected int getJewelPrice() {
        return jewelPrice;
    }

    @Override
    public String toString() {
        return String.format(" price jewel : %d", getJewelPrice());
    }
}
