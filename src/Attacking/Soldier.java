package Attacking;

public class Soldier implements Troops {

    private int hp;
    private int damage;
    private int level;

    public Soldier() {
        hp = 100;
        damage = 10;
        level = 1;
    }

    /**
     * Gets hp.
     *
     * @return the hp
     */
    @Override
    public int getHP() {
        return 0;
    }

    /**
     * How much damage the troop deals.
     *
     * @return the int
     */
    @Override
    public int damageDealt() {
        return 0;
    }

    /**
     * Returns troop level.
     *
     * @return the level
     */
    @Override
    public int getLevel() {
        return 0;
    }

    /**
     * Upgrade troop level.
     *
     * @return the int
     */
    @Override
    public int upgradeLevel() {
        return 0;
    }

}
