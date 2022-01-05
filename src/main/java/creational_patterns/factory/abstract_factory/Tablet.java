package creational_patterns.factory.abstract_factory;

public abstract class Tablet {
    protected String name;

    public Tablet(String name) {
        this.name = name;
    }

    public abstract void produceTablet();
}
