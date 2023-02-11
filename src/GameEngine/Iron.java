package GameEngine;

public class Iron implements Resource{
    private int iron;

    public Iron() {
        iron = 0;
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
