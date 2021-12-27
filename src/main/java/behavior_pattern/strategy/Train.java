package behavior_pattern.strategy;

public class Train extends Strategy {
    public Train(int cost) {
        super(cost);
    }

    @Override
    public void goToBeiJing() {
        System.out.println("乘坐火车去北京！");
    }
}
