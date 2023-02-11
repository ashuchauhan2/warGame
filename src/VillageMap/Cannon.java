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
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getAttacked() {
        return 0;
    }

    @Override
    public void upgrade() {

    }

    @Override
    public void doDamage(int damage) {

    }

    @Override
    public void repair() {

    }
}
