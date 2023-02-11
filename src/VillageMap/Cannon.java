package VillageMap;

public class Cannon implements Building {
    private int level;
    private int health;

    private int damage;

    public Cannon() {
        level = 1;
        health = 100;
        damage = 10;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void upgrade() {
        level++;
        health += 100;
        damage += 10;
    }

    public void damage(int damage) {
        health -= damage;
    }

    public void repair() {
        health = 100;
    }


}
