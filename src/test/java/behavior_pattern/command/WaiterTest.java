package behavior_pattern.command;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest extends BasicTest {

    @Test
    public void should_can_order_and_cancel_dishes() {
        Cook cook = new Cook();
        ConcreteOrderCommand orderCommand = new ConcreteOrderCommand();
        orderCommand.setCook(cook);
        Waiter waiter = new Waiter();
        waiter.setOrderCommand(orderCommand);

        waiter.orderService("回锅肉");
        waiter.orderService("青椒土豆丝");
        waiter.orderFinished();

        waiter.cancelOrder("回锅肉");
        waiter.cancelOrder("蚂蚁上树");
        waiter.cancelOrder("双龙戏珠");
        waiter.cancelFinished();

        assertEquals("""
                客户点了菜品：回锅肉
                客户点了菜品：青椒土豆丝
                点餐完成，交给厨房做菜
                厨师正在做菜: 回锅肉
                厨师正在做菜: 青椒土豆丝
                客户取消菜品：回锅肉
                客户取消菜品：蚂蚁上树
                客户取消菜品：双龙戏珠
                通知厨房客户取消了菜品：[回锅肉, 蚂蚁上树, 双龙戏珠]
                厨师知道客户取消了，不再做：[回锅肉, 蚂蚁上树, 双龙戏珠]""", outputStreamCaptor.toString().trim());
    }
}