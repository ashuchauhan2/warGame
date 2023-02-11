package GameEngine;

public class Lumber implements Resource {

    private int lumber;

    public Lumber() {
        lumber = 0;
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
