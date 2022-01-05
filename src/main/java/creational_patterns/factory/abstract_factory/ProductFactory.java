package creational_patterns.factory.abstract_factory;

public interface ProductFactory {
    Phone producePhone();

    Tablet produceTablet();
}
