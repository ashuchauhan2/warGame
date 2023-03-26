package Model;

public interface ResourceMines extends Building {

    public ResourceMines createResourceMine();
    public Resource createResource();
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

