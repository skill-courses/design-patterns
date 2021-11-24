package behavior_pattern.mediator;

public interface Medium {
    void register(Customer customer);
    void relay(Customer customer, String message);
}
