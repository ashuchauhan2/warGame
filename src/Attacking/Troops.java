package Attacking;

public interface Troops {
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
