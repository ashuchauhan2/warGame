package Model;

import View.Iron;

public class IronMine implements ResourceMines {

    private int hp;
    private int lvl;
    private int score;

    public IronMine() {
        this.hp = 50;
        this.lvl = 1;
        this.score = 1;
    }

    @Override
    public ResourceMines createResourceMine() {
        return new IronMine();
    }

    @Override
    public Resource createResource() {
        return new Iron();
    }

    @Override
    public int maxResource(int lvl) {
        return lvl*10;
    }

    /**
     * Upgrade mine level.
     *
     * @return the int
     */
    @Override
    public void upgradeMine() {
        lvl++;
        score++;
        //hp+=10;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    @Override
    public int getLevel() {
        return lvl;
    }

    /**
     * Gets the defensive score of the building.
     *
     * @return the health
     */
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void upgrade() {
        upgradeMine();
    }
}
