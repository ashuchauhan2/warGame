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
        return 0;
    }

    /**
     * Spend resource.
     *
     * @param spent the spent
     */
    @Override
    public void spendResource(Resource spent) {

    }
}

