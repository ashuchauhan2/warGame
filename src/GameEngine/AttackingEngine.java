package GameEngine;

import Attacking.*;
import VillageMap.*;

public class AttackingEngine {
    /**
     * Generate random village to attack.
     */
    public void generateVillageScore() {
        // Generate random village to attack

    }

    /**
     * Attack outcome.
     *
     * @param defensiveScore the defensive score
     * @param offensiveScore the offensive score
     */
    public void attackOutcome(int defensiveScore, int offensiveScore) {
        if(defensiveScore + Math.random()*10 > offensiveScore) {
            System.out.println("You lost the battle!");
        } else {
            System.out.println("You won the battle!");
        }
    }

}
