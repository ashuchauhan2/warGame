package VillageMap;

import GameEngine.*;

public interface ResourceMines extends Building{

    /**
     * Mine resource.
     *
     * @param lvl the lvl
     * @return the resource
     */

    /**
     * Max resource amount.
     *
     * @param lvl is villagehall level
     * @return the int
     */
    public int maxResource(int lvl);

    /**
     * Upgrade mine level.
     *
     * @return the int
     */
    public void upgradeMine();
}

