package View;

import Model.Resource;

public class Iron implements Resource {
    private int iron;
    private Iron ironView;

    public Iron() {
        iron = 0;
    }

    public void IronView (Iron ironV){
        this.ironView= ironV;
    }

public void ironDisplay(){
    System.out.println("Iron: " + getResource());
}
    /**
     * Gets resource.
     *
     * @return the resource
     */
    @Override
    public int getResource() { return iron; }

    /**
     * Spend resource.
     *
     * @param spent the spent
     */
    @Override
    public void spendResource(Resource spent) {
        iron -= spent.getResource();
    }

    @Override
    public void mineResource() {
        iron += 20;
    }
}
