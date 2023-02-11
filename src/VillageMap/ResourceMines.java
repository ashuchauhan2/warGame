package VillageMap;

import GameEngine.*;

public interface ResourceMines {

    public Resource mineResource(int lvl);
    public int maxResource(int lvl);
    public int upgradeMine(int mineLvl);
    public int getHP(int lvl);
    
}

