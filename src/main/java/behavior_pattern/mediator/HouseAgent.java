package behavior_pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class HouseAgent implements Medium {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void register(Customer customer) {
        customers.add(customer);
        customer.setMedium(this);
    }

    @Override
    public void relay(Customer customer, String message) {
        customers.forEach(item -> {
            if (customer.name != item.name) {
                item.receive(customer.name + "的消息：" + message);
            }
        });
    }
}
