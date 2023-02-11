package VillageMap;

import GameEngine.Resource;

public class IronMine implements ResourceMines{
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
