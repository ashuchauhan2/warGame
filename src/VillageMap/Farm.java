package VillageMap;

import Attacking.Troops;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Troops> army;

    public Farm() {
        army = new ArrayList<Troops>();
    }
    public boolean isFarmFull() {
        return army.size() == 10;
    }

    public void addTroops(Troops troops) {
        if (!isFarmFull()) {
            army.add(troops);
        }
    }

    public void useTroops(Troops troops) {
        army.remove(troops);
    }
}
