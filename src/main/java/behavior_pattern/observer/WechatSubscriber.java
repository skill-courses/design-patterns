package behavior_pattern.observer;

import lombok.Builder;

@Builder
public class WechatSubscriber implements Subscriber {
    private String name;

    @Override
    public void receive(String message) {
        System.out.println(this.name + "已经收到订阅消息: " + message);
    }
}
