package Model;

public interface Troops {

    public Troops createTroop();
    /**
     * Gets hp.
     *
     * @return the hp
     */
    public int getScore();

    /**
     * Returns troop level.
     *
     * @return the level
     */
    public int getLevel();

    /**
     * Upgrade troop level.
     *
     * @return the int
     */
    public void upgradeLevel();
}
