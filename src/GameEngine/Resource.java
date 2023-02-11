package GameEngine;

public interface Resource {
    /**
     * Gets resource.
     *
     * @return the resource
     */
    public int getResource();

    /**
     * Spend resource.
     *
     * @param spent the spent
     */
    public void spendResource(Resource spent);
}
