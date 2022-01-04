package creational_patterns.factory.factory;

import creational_patterns.factory.simple_factory.Product;
import lombok.Getter;

public interface Factory {
    public abstract Product produceProduct(String name);
}
