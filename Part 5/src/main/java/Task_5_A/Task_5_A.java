package Task_5_A;

public class Task_5_A {
    // Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
// (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.

    public static void main(String[] args) {
        Flowers flowers_1 = new Flowers("Red rose", 3);
        Flowers flowers_2 = new Flowers("White rose", 5);
        Flowers flowers_3 = new Flowers("Lily", 1);
        Compositions compositions_1 = new Compositions(1, Packing.FILM);
        compositions_1.addFlowersCompositions(flowers_1);
        Compositions compositions_2 = new Compositions(2, Packing.ORGANZA);
        compositions_2.addFlowersCompositions(flowers_2);
        Compositions compositions_3 = new Compositions(3, Packing.PAPER);
        compositions_3.addFlowersCompositions(flowers_3);
        compositions_1.showFlowersCompositions(compositions_1);
        compositions_2.showFlowersCompositions(compositions_2);
        compositions_3.showFlowersCompositions(compositions_3);
        System.out.println("Change quantity flowers in composition" + compositions_1.getCompositionsID());
        flowers_1.setCountFlowers(7);
        compositions_1.showFlowersCompositions(compositions_1);
        System.out.println("Change packaging in composition" + compositions_2.getCompositionsID());
        compositions_2.setPackingCompositions(Packing.PAPER);
        compositions_2.showFlowersCompositions(compositions_2);
    }

}
