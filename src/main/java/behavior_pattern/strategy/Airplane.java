package behavior_pattern.strategy;

public class Airplane extends Strategy {
    public Airplane(int cost) {
        super(cost);
    }

    @Override
    public void goToBeiJing() {
        System.out.println("乘坐飞机到达北京！");
    }
}
