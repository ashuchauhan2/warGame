package VillageMap;

import GameEngine.*;

public interface ResourceMines {

    /**
     * Mine resource.
     *
     * @param lvl the lvl
     * @return the resource
     */

    /**
     * Max resource amount.
     *
     * @param lvl the lvl
     * @return the int
     */
    public int maxResource(int lvl);

    /**
     * Upgrade mine level.
     *
     * @param mineLvl the mine lvl
     * @return the int
     */
    public int upgradeMine(int mineLvl);

    /**
     * Gets hp. //hp for resource mines is set in the constructor
     *
     * @param lvl the lvl
     * @return the hp
     */
    public int getHP(int lvl);
    
}

