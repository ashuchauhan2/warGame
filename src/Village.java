import VillageMap.*;
import GameEngine.*;
import Attacking.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Village {
    private VillageHall vh;
    private Gold gold;
    private Lumber lumber;
    private Iron iron;
    private Workers[] workers = new Workers[2];
    private ArrayList<GoldMine> goldMines = new ArrayList<>();
    private ArrayList<IronMine> ironMines  = new ArrayList<>();
    private ArrayList<LumberMill> lumberMills = new ArrayList<>();
    private ArrayList<ArcherTower> archerTowers = new ArrayList<>();
    private ArrayList<Cannon> cannons = new ArrayList<>();
    private ArrayList<Farm> farms = new ArrayList<>();
    private BuildVillage village = new BuildVillage();
    private Scanner scan = new Scanner(System.in);

    public Village() {
        gold = new Gold();
        lumber = new Lumber();
        iron = new Iron();
        workers[0] = new Workers();
        workers[1] = new Workers();

    }

    /**
     * Adds a building to the village.
     *
     * @param building
     */
    private void addBuilding(Building building) {
        if(workers[0].isAvailable() == true || workers[1].isAvailable() == true) {
            village.addBuilding(building);
        }

    }

    private void runGame() {
        System.out.println("Welcome to your village!");
        while(true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Build a building");
            System.out.println("2. Upgrade a building");
            System.out.println("3. Attack");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            switch(choice) {
                case(1):
                    System.out.println("What building would you like to build?");
                    System.out.println("1. Gold Mine");
                    System.out.println("2. Iron Mine");
                    System.out.println("3. Lumber Mill");
                    System.out.println("4. Archer Tower");
                    System.out.println("5. Cannon");
                    System.out.println("6. Farm");
                    System.out.println("7. Village Hall");
                    int buildingChoice = scan.nextInt();
                    switch(buildingChoice) {
                        case(1):
                            addBuilding(new GoldMine());
                            break;
                        case(2):
                            addBuilding(new IronMine());
                            break;
                        case(3):
                            addBuilding(new LumberMill());
                            break;
                        case(4):
                            addBuilding(new ArcherTower());
                            break;
                        case(5):
                            addBuilding(new Cannon());
                            break;
                    }
                    break;
                case(2):
                    System.out.println("What building would you like to upgrade?");
                    System.out.println("1. Gold Mine");
                    System.out.println("2. Iron Mine");
                    System.out.println("3. Lumber Mill");
                    System.out.println("4. Archer Tower");
                    System.out.println("5. Cannon");
                    System.out.println("6. Village Hall");
                    int upgradeChoice = scan.nextInt();
                    switch(upgradeChoice) {
                        case(1):
                            for(GoldMine g : goldMines) {
                                if(g.getLevel() < vh.maxBuildingLevel(vh.getVillageHallLvl())) {
                                    g.upgradeMine();
                                }
                            }
                            break;
                        case(2):
                            for(IronMine i : ironMines) {
                                if(i.getLevel() < vh.maxBuildingLevel(vh.getVillageHallLvl())) {
                                    i.upgradeMine();
                                }
                            }
                            break;
                        case(3):
                            for(LumberMill l : lumberMills) {
                                if(l.getLevel() < vh.maxBuildingLevel(vh.getVillageHallLvl())) {
                                    l.upgradeMine();
                                }
                            }
                            break;
                        case(4):
                            for(ArcherTower a : archerTowers) {
                                if(a.getLevel() < vh.maxBuildingLevel(vh.getVillageHallLvl())) {
                                    a.upgrade();
                                }
                            }
                            break;
                        case(5):
                            for(Cannon c : cannons) {
                                if(c.getLevel() < vh.maxBuildingLevel(vh.getVillageHallLvl())) {
                                    c.upgrade();
                                }
                            }
                            break;
                        case(6):
                            if(vh.getVillageHallLvl() < 5) {
                                vh.upgradeVillageHall();
                            }
                            break;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Village v = new Village();
        while(true) {
            v.runGame();
        }
    }
}
