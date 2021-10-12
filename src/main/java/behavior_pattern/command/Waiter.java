package behavior_pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private OrderCommand orderCommand;
    private final List<String> dishes = new ArrayList<>();
    private final List canceledDishes = new ArrayList<>();

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    void orderService(String name) {
        System.out.println("客户点了菜品：" + name);
        dishes.add(name);
    }

    void cancelOrder(String name) {
        System.out.println("客户取消菜品：" + name);
        canceledDishes.add(name);
    }

    void orderFinished() {
        System.out.println("点餐完成，交给厨房做菜");
        this.orderCommand.execute(dishes);
    }

    void cancelFinished() {
        System.out.println("通知厨房客户取消了菜品：" + canceledDishes);
        this.orderCommand.cancel(canceledDishes);
    }
}
