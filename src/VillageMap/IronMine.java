package VillageMap;

import GameEngine.Resource;

public class IronMine implements ResourceMines{

    private int hp;
    private int lvl;

    public IronMine() {
        this.hp = 50;
        this.lvl = 1;
    }

    @Override
    public Resource mineResource(int lvl) {
        return ;
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
