package GameEngine;

public class Iron implements Resource{
    private int iron;

    public Iron() {
        iron = 0;
    }

    @Override
    public int getResource() {
        return iron;
    }

    @Override
    public void spendResource(Resource spent) {
        iron -= spent.getResource();
    }
}
