package VillageMap;

public class VillageHall {
    private int villageHallLvl;
    final int maxVillageHallLvl = 5; //max village hall lvl is 5

    /**
     * Instantiates a new Village hall.
     */
    public VillageHall() {
        this.villageHallLvl = 1;
    }

    /**
     * Gets village hall lvl.
     *
     * @return the village hall lvl
     */
    public int getVillageHallLvl() {
        return this.villageHallLvl;
    }

    /**
     * Max building level.
     *
     * @param villageHallLvl the village hall lvl
     * @return the int
     */
    public int maxBuildingLevel(int villageHallLvl) {
        return villageHallLvl + 1;
    }

    /**
     * Upgrade village hall.
     *
     * @return the int
     */
    public int upgradeVillageHall() {
        if (this.villageHallLvl < maxVillageHallLvl) {
            this.villageHallLvl++;
            return this.villageHallLvl;
        }
        return this.villageHallLvl;
    }



}
