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

    private void addBuilding(Building building) {
        // Add building to village
    }

    private void isWorkerAvailable() {

    }

}
