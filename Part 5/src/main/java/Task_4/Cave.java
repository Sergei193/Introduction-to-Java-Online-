package Task_4;

import Task_1.File;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Cave {
    private final int COUNTJEWELS = 100;
    private int caveID;
    private Jewel[] jewelsCave;
    protected ArrayList<Jewel> listJewelsCave;

    protected Cave(int caveID) {
        this.caveID = caveID;
        listJewelsCave = new ArrayList<>(COUNTJEWELS);
    }

    protected Jewel[] createJewelsCave() {
        jewelsCave = new Jewel[COUNTJEWELS];
        for (int i = 0; i < COUNTJEWELS; i++) {
            jewelsCave[i] = new Jewel();
        }
        return jewelsCave;
    }

    protected void addJewelsList(Jewel[] jewelsCave) {
        if (jewelsCave.length == 0) throw new NullPointerException("Jewels are absenting in cave!!!");
        for (Jewel jewel : jewelsCave) {
            listJewelsCave.add(jewel);
        }
    }

    protected void writeJewelsFile() {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/jewels_list.txt", false)) {
            fileWriter.write("In cave № " + getCaveID() + " keeping jewels" + "\n");
            for (Jewel jewel : listJewelsCave) {
                fileWriter.write(jewel.toString() + "\n");
            }
            fileWriter.flush();
            System.out.println(" Jewels write in File");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void readJewelsFile() {
        try (FileReader fileReader = new FileReader("src/main/resources/jewels_list.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void buyJewels(int count, int summa) {
        LinkedList<Jewel> listPurchases = new LinkedList<>();
        System.out.println("We would like to buy " + count + " jewels " + " for summa " + summa);
        int k = summa / count;
        for (Jewel jewel : listJewelsCave) {
            if (jewel.getJewelPrice() < k && summa >= 0) {
                summa -= jewel.getJewelPrice();
                listPurchases.add(jewel);
            } else if (summa < 0) {
                break;
            }
        }
        System.out.println("Purchases");
        for (Jewel jewel : listPurchases) {
            System.out.println(jewel.toString());
        }
    }

    protected void sortedJewelCaveAscending() {
        System.out.println("Sort Jewels ascending");
        listJewelsCave.sort(Comparator.comparing(Jewel::getJewelPrice));
        printListJewelsCave();
    }

    protected Jewel findMostExpensiveJewel() {
        int maxPrice = 0;
        Jewel maxPriceJewel = null;
        for (int i = 0; i < listJewelsCave.size(); i++) {
            if (maxPrice < listJewelsCave.get(i).getJewelPrice()) {
                maxPrice = listJewelsCave.get(i).getJewelPrice();
                maxPriceJewel = listJewelsCave.get(i);
            }
        }
        return maxPriceJewel;
    }

    protected void printListJewelsCave() {
        for (int i = 0; i < getListJewelsCave().size(); i++) {
            System.out.println("Jewel № " + (i + 1) + getListJewelsCave().get(i).toString());
        }
    }

    public int getCaveID() {
        return caveID;
    }

    protected ArrayList<Jewel> getListJewelsCave() {
        return listJewelsCave;
    }
}
