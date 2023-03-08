package GameEngine;

public class Gold implements Resource {
    private int gold;

    public Gold() {
        gold = 0;
    }


    /**
     * Gets resource.
     *
     * @return the resource
     */
    @Override
    public int getResource() {
        return gold;
    }

    /**
     * Spend resource.
     *
     * @param spent the spent
     */
    @Override
    public void spendResource(Resource spent) {
        gold -= spent.getResource();
    }

    @Override
    public void mineResource() {
        gold += 20;
    }
}

