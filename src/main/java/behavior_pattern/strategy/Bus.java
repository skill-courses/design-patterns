package behavior_pattern.strategy;

public class Bus extends Strategy {
    public Bus(int cost) {
        super(cost);
    }

    @Override
    public void goToBeiJing() {
        System.out.println("乘坐大巴车去北京！");
    }
}
