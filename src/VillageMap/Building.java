package VillageMap;


public interface Building {

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel();

    /**
     * Gets the defensive score of the building.
     *
     * @return the health
     */
    public int getScore();

    public void upgrade();

    /**
     * Deals damage.
     *
     * @param damage the damage
     */
}
