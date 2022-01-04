package creational_patterns.factory.simple_factory;

public abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void produce();
}
