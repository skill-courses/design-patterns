package behavior_pattern.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {
    private List<Strategy> strategies;

    public Context() {
        this.strategies = Arrays.asList(new Airplane(5000), new Train(2000), new Bus(1000), new Cycling(500));
    }

    public void goToBeiJing(int money) {
        this.strategies.stream().filter(strategy -> money > strategy.getCost()).findFirst().ifPresentOrElse(it -> it.goToBeiJing(), () -> System.out.println("这点钱还是不出去潇洒了吧，好好呆着！"));
    }
}
