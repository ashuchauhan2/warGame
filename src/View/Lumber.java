package View;


import Model.Resource;

public class Lumber implements Resource {

    private int lumber;

    public Lumber() {
        lumber = 0;
    }

    public void lumberDisplay(){
        System.out.println("Lumber: " + getResource());
    }

    /**
     * Gets resource.
     *
     * @return the resource
     */
    @Override
    public int getResource() {
        return lumber;
    }

    /**
     * Spend resource.
     *
     * @param spent the spent
     */
    @Override
    public void spendResource(Resource spent) {
        lumber -= spent.getResource();
    }

    @Override
    public void mineResource() {
        lumber += 20;
    }

}
