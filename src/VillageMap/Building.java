package VillageMap;

public interface Building {

    public int getLevel();

    public int getHealth();

    public int getDamage();

    public void upgrade();

    public void damage(int damage);

    public void repair();
}
