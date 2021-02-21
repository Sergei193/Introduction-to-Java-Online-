package Task_4;

import java.util.ArrayList;

public class Dragon {
    private int dragonID;
    private String nameDragon;
    protected ArrayList<Cave> listCaveDragon;
    int caveID = 0;
    Cave cave_1;

    protected Dragon(int dragonID, String nameDragon) {
        this.dragonID = dragonID;
        this.nameDragon = nameDragon;
        listCaveDragon = new ArrayList<>();
        caveID++;
        cave_1 = new Cave(caveID);

    }

    public int getDragonID() {
        return dragonID;
    }

    public String getNameDragon() {
        return nameDragon;
    }

    @Override
    public String toString() {
        return "Dragon - >  " + "dragonID : " + dragonID + ", nameDragon : " + nameDragon;
    }
}
