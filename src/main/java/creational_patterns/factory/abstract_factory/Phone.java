package creational_patterns.factory.abstract_factory;

public abstract class Phone {
    protected String name;

    public Phone(String name) {
        this.name = name;
    }

    public abstract void producePhone();
}
