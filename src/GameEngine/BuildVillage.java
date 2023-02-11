package GameEngine;

import VillageMap.*;

import java.util.ArrayList;

public class BuildVillage {

    private VillageHall vh;
    private ArrayList<GoldMine> goldMines;
    private ArrayList<IronMine> ironMines;
    private ArrayList<LumberMill> lumberMills;
    private ArrayList<ArcherTower> archerTowers;
    private ArrayList<Cannon> cannons;
    private ArrayList<Farm> farms;

    public BuildVillage() {
        vh = new VillageHall();
        goldMines = new ArrayList<>();
        ironMines = new ArrayList<>();
        lumberMills = new ArrayList<>();
        archerTowers = new ArrayList<>();
        cannons = new ArrayList<>();
        farms = new ArrayList<>();
    }

    private void addBuilding(Building building) {
        // Add building to village
    }

    private int maxGoldMines(int vhLevel) {
        // Max number of gold mines based on village hall level
        return 0;
    }

    private int maxIronMines(int vhLevel) {
        // Max number of iron mines based on village hall level
        return 0;
    }

    private int maxLumberMines(int vhLevel) {
        // Max number of lumber mines based on village hall level
        return 0;
    }

    private int maxArcherTowers(int vhLevel) {
        // Max number of archer towers based on village hall level
        return 0;
    }

    private int maxCannons(int vhLevel) {
        // Max number of cannon towers based on village hall level
        return vh.getVillageHallLvl();
    }

    private int maxArmySpace(int farms) {
        // Max number of army space based on # of farms
        return 0;
    }

    private int maxFarms(int vhLevel) {
        // Max number of farms based on village hall level
        return 0;
    }

    private int getDefensiveScore(int archerTowers, int cannons, int villageHallLevel) {
        // Defensive score based on # of archer towers and cannons
        return 0;
    }

}
