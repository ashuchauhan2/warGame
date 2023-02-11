package VillageMap;

public class VillageHall {
    private int villageHallLvl;
    final int maxVillageHallLvl = 5;

    public VillageHall() {
        this.villageHallLvl = 1;
    }

    public int getVillageHallLvl() {
        return this.villageHallLvl;
    }

    public int maxBuildingLevel(int villageHallLvl) {
        return villageHallLvl + 1;
    }

    public int upgradeVillageHall() {
        if (this.villageHallLvl < maxVillageHallLvl) {
            this.villageHallLvl++;
            return this.villageHallLvl;
        }
        return this.villageHallLvl;
    }



}
