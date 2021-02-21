package Task_5_A;

import java.util.ArrayList;

public class Compositions {
    private int compositionsID;
    private Packing packingCompositions;
    protected ArrayList<Flowers> listFlowersCompositions;

    public Compositions(int compositionsID, Packing packingCompositions) {
        this.compositionsID = compositionsID;
        this.packingCompositions = packingCompositions;
        listFlowersCompositions = new ArrayList<>();
    }

    protected void addFlowersCompositions(Flowers flowers) {
        listFlowersCompositions.add(flowers);
    }

    protected void showFlowersCompositions(Compositions compositions) {
        System.out.println("Composition № " + compositions.getCompositionsID() + " packing " + compositions.getPackingCompositions());
        for (Flowers flowers : listFlowersCompositions) {
            System.out.println(flowers.toString());
        }
    }

    public int getCompositionsID() {
        return compositionsID;
    }

    public Packing getPackingCompositions() {
        return packingCompositions;
    }

    public void setPackingCompositions(Packing packingCompositions) {
        this.packingCompositions = packingCompositions;
    }
}
