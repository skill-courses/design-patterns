package behavior_pattern.strategy;

public class Cycling extends Strategy {
    public Cycling(int cost) {
        super(cost);
    }

    @Override
    public void goToBeiJing() {
        System.out.println("骑行去北京！");
    }
}
