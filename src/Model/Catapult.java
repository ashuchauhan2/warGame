package Model;

public class Catapult implements Troops {
    private int hp;
    private int score;
    private int level;

    public Catapult() {
        score = 100;
        level = 1;
    }

    @Override
    public Troops createTroop() {
        return new Catapult();
    }
    public void catapultDisplayLevel(){
        System.out.println("Catapult level is: " + getLevel());
    }
    /**
     * Gets hp.
     *
     * @return the hp
     */
    @Override
    public int getScore() {
        return score;
    }

    /**
     * Returns troop level.
     *
     * @return the level
     */
    @Override
    public int getLevel() {
        return level;
    }

    /**
     * Upgrade troop level.
     *
     * @return the int
     */
    @Override
    public void upgradeLevel() {
        level++;
        score += (score*0.15); //15% increase in score with each upgrade
    }
}