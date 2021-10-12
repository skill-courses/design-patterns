package behavior_pattern.command;

import java.util.List;

public class Cook {
    void cooking(String dish) {
        System.out.println("厨师正在做菜: " + dish);
    }

    void knownCancel(List<String> dishes) {
        System.out.println("厨师知道客户取消了，不再做：" + dishes);
    }
}
