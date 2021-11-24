package behavior_pattern.mediator;

abstract public class Customer {
    protected Medium medium;
    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
