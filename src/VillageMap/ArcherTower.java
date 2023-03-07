package VillageMap;

public class ArcherTower implements Building {

    private int level;
    private int score;

    public ArcherTower() {
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
