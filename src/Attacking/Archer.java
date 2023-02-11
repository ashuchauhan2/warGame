package Attacking;

public class Archer implements Troops{
    private int hp;
    private int damage;
    private int level;

    public Archer() {
        hp = 100;
        damage = 100;
        level = 1;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int damageDealt() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int upgradeLevel() {
        level++;
        return level;
    }
}
