package GameEngine;

public class Gold implements Resource {
    private int gold;

    public Gold() {
        gold = 0;
    }

    public int getResource() {
        return gold;
    }

    public void spendResource(Resource spent) {
        gold -= spent.getResource();
    }
}

