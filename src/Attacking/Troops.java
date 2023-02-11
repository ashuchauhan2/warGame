package Attacking;

public interface Troops {
    /**
     * Gets hp.
     *
     * @return the hp
     */
    public int getHP();

    /**
     * How much damage the troop deals.
     *
     * @return the int
     */
    public int damageDealt();

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
    public int upgradeLevel();
}
