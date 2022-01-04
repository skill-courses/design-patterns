package creational_patterns.factory.factory;

import creational_patterns.factory.simple_factory.Phone;
import creational_patterns.factory.simple_factory.Product;
import creational_patterns.factory.simple_factory.Tablet;

public class PhoneFactory implements Factory{

    @Override
    public Product produceProduct(String name) {
        return new Phone(name);
    }
}
