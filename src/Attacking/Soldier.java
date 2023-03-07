package Attacking;

public class Soldier implements Troops {

    private int score;
    private int level;

    public Soldier() {
        score = 100;
        level = 1;
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
