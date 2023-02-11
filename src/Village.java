import VillageMap.*;
import GameEngine.*;
import Attacking.*;

public class Village {
    private VillageHall vh;
    private Gold gold;
    private Lumber lumber;
    private Iron iron;
    private Workers[] workers = new Workers[2];

    public Village() {
        vh = new VillageHall();
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
        // Add building to village
    }

    /**
     * Helper method to add building, a worker must be available for a building to be added.
     *
     */
    private void isWorkerAvailable() {

    }

    private void runGame() {

    }

    public static void main(String[] args) {
        Village v = new Village();
        while(true) {
            v.runGame();
        }
    }
}
