package GameEngine;

import VillageMap.*;

import java.io.OptionalDataException;
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

    public void addBuilding(Building building) {
        // Add building to village
        switch(building.getClass().getSimpleName()) {
            case "GoldMine":
                if(goldMines.size() < maxGoldMines()) {
                    goldMines.add((GoldMine) building);
                }
                break;
            case "IronMine":
                if(ironMines.size() < maxIronMines()) {
                    ironMines.add((IronMine) building);
                }
                break;
            case "LumberMill":
                if(lumberMills.size() < maxLumberMines()) {
                    lumberMills.add((LumberMill) building);
                }
                break;
            case "ArcherTower":
                if(archerTowers.size() < maxArcherTowers()) {
                    archerTowers.add((ArcherTower) building);
                }
                break;
            case "Cannon":
                if(cannons.size() < maxCannons()) {
                    cannons.add((Cannon) building);
                }
                break;
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

    public int maxArcherTowers() {
        // Max number of archer towers based on village hall level
        return vh.getVillageHallLvl();
    }

    public int maxCannons() {
        // Max number of cannon towers based on village hall level
        return vh.getVillageHallLvl();
    }

    public int maxArmySpace(int farms) {
        // Max number of army space based on # of farms
        return 10 * farms;
    }

    public int maxFarms() {
        // Max number of farms based on village hall level
        return vh.getVillageHallLvl();
    }

    public int getDefensiveScore() {
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
