package behavior_pattern.strategy;

public abstract class Strategy {
    private int cost;

    public Strategy(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    abstract void goToBeiJing();
}
