package behavior_pattern.command;

import java.util.List;

public class ConcreteOrderCommand implements OrderCommand {
    private Cook cook;

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute(List<String> dishes) {
        dishes.forEach(dish -> cook.cooking(dish));
    }

    @Override
    public void cancel(List<String> dishes) {
        this.cook.knownCancel(dishes);
    }
}
