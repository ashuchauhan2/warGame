package VillageMap;

public class Cannon implements Building {
    private int level;
    private int health;

    private int damage;

    public Cannon() {
        this.level = 1;
        this.health = 100;
        this.damage = 10;
    }
    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttacked(int damageTaken) { //attack cannon
        return health -= damageTaken;

    }

    @Override
    public void upgrade() { //upgrade cannon level
        level++;
        health += 100;
        damage += 10;
    }

    @Override
    public int doDamage(int damage) { //defense attacks
        return damage;
    }

    /**
     * Repair to full HP.
     * Used when the attack is over to restore building hp.
     */
    @Override
    public void repair() {

    }
}
