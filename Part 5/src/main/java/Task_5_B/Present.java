package Task_5_B;

import java.util.LinkedList;

public class Present {
    private int presentID;
    private Packing packingPresent;
    protected LinkedList<Candy> listCandyPresent;

    public Present(int presentID) {
        this.presentID = presentID;
        listCandyPresent = new LinkedList<>();
    }

    public int getPresentID() {
        return presentID;
    }

    public void setPresentID(int presentID) {
        this.presentID = presentID;
    }

    public Packing getPackingPresent() {
        return packingPresent;
    }

    public void setPackingPresent(Packing packingPresent) {
        this.packingPresent = packingPresent;
    }

    protected Candy collectCandy(String nameCandy, int countCandy) {
        Candy candy = new Candy(nameCandy, countCandy);
        return candy;
    }

    protected void addCandyPresent(Candy candy) {
        listCandyPresent.add(candy);
    }

    protected void changeCandyPresent(String nameCandy, int countAdd) {
        for (Candy candy : listCandyPresent) {
            if (candy.getNameCandy().equalsIgnoreCase(nameCandy)) {
                int totalCount = candy.getCountCandy() + countAdd;
                candy.setCountCandy(totalCount);
                System.out.println(" Number " + candy.getCountCandy() + " of sweets " + candy.getNameCandy());
            }

        }
    }

    @Override
    public String toString() {
        return String.format("Present : %d, \nPacking present : %s,\n%s", getPresentID(), getPackingPresent(), printCandyPresent());
    }

    protected String printCandyPresent() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Candy candy : listCandyPresent) {
            stringBuilder.append(candy.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
