package VillageMap;


public interface Building {

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel();

    /**
     * Gets health.
     *
     * @return the health
     */
    public int getHealth();

    /**
     * Gets damaged.
     *
     * @return the damage
     */
    public int getAttacked();

    /**
     * Upgrade building level.
     */
    public void upgrade();

    /**
     * Deals damage.
     *
     * @param damage the damage
     */
    public void doDamage(int damage);

    /**
     * Repair to full HP.
     * Used when the attack is over to restore building hp.
     */
    public void repair();
}
