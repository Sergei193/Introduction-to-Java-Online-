package Task_5_B;

public class Task_5_B {

    public static void main(String[] args) {
        System.out.println(" To collect present");
        Present present_1 = new Present(1);
        present_1.listCandyPresent.add(present_1.collectCandy("Chocolate of candy", 50));
        present_1.setPackingPresent(Packing.BOX);
        present_1.listCandyPresent.add(present_1.collectCandy("Marmalade of candy", 100));
        System.out.println(present_1.toString());
        System.out.println("Add in present 50 candy");
        present_1.changeCandyPresent("Chocolate of candy", 50);
        System.out.println(present_1.toString());


    }

}
