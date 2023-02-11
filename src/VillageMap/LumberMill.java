package VillageMap;

import GameEngine.Resource;

public class LumberMill implements ResourceMines{

    private int hp;
    private int lvl;

    public LumberMill() {
        this.hp = 50;
        this.lvl = 1;
    }

    @Override
    public Resource mineResource(int lvl) {
        return null;
    }

    @Override
    public int maxResource(int lvl) {
        return 0;
    }

    @Override
    public int upgradeMine(int mineLvl) {
        return 0;
    }

    @Override
    public int getHP(int lvl) {
        return 0;
    }
}
