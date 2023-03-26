package Model;

public class Archer implements Troops {
    private int score;
    private int level;

    public Archer() {
        score = 85;
        level = 1;
    }


    @Override
    public Troops createTroop() {
        return new Archer();
    }

    public void archerDisplayLevel(){
        System.out.println("Soldier level is: " + getLevel());
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
