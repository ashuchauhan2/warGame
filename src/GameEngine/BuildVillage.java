package GameEngine;

import VillageMap.*;

import java.io.OptionalDataException;
import java.util.ArrayList;

public class BuildVillage {

    private VillageHall vh;
    public ArrayList<GoldMine> goldMines;
    public ArrayList<IronMine> ironMines;
    public ArrayList<LumberMill> lumberMills;
    public ArrayList<ArcherTower> archerTowers;
    public ArrayList<Cannon> cannons;
    public ArrayList<Farm> farms;

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
        if (building.equals("GoldMine" && goldMines.size() <maxGoldMines()) {
            goldMines.add((GoldMine) building);
        } else if (building.equals("IronMine")) {
            ironMines.add((IronMine) building);
        } else if (building.equals("LumberMill")) {
            lumberMills.add((LumberMill) building);
        }
    }

    private int maxGoldMines() {
        // Max number of gold mines based on village hall level
        return vh.getVillageHallLvl() + 1;
    }

    private int maxIronMines() {
        // Max number of iron mines based on village hall level
        return vh.getVillageHallLvl() + 1;
    }

    private int maxLumberMines() {
        // Max number of lumber mines based on village hall level
        return vh.getVillageHallLvl() + 1;
    }

    private int maxArcherTowers(int vhLevel) {
        // Max number of archer towers based on village hall level
        return vhLevel + 1;
    }

    private int maxCannons(int vhLevel) {
        // Max number of cannon towers based on village hall level
        return vh.getVillageHallLvl();
    }

    private int maxArmySpace(int farms) {
        // Max number of army space based on # of farms
        return 10 * farms;
    }

    private int maxFarms(int vhLevel) {
        // Max number of farms based on village hall level
        return vhLevel;
    }

    private int getDefensiveScore() {
        // Defensive score based on # of archer towers and cannons
        int score = 0;
        for(ArcherTower at : archerTowers) {
            score += at.getLevel();
        }
        for(Cannon c : cannons) {
            score += c.getLevel();
        }
        score += vh.getVillageHallLvl();
        return score;
    }

}
