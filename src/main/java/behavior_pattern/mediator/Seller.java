package behavior_pattern.mediator;

public class Seller extends Customer{
    public Seller(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        medium.relay(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("卖方" + this.name + "收到" + message);
    }
}
