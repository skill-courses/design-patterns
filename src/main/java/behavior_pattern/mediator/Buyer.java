package behavior_pattern.mediator;

public class Buyer extends Customer{
    public Buyer(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        medium.relay(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("买方" + this.name + "收到" + message);
    }
}
