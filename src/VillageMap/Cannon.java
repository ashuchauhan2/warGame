package VillageMap;

public class Cannon implements Building {
    private int level;
    private int score;

    private int damage;

    public Cannon() {
        this.level = 1;
        this.score = 100;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    @Override
    public int getLevel() {
        return level;
    }

    /**
     * Gets the defensive score of the building.
     *
     * @return the health
     */
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void upgrade() {
        level++;
        score += 100;
    }

}
