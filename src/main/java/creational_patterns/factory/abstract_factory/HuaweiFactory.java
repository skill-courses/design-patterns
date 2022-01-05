package creational_patterns.factory.abstract_factory;

public class HuaweiFactory implements ProductFactory {
    @Override
    public Phone producePhone() {
        return new HuaweiPhone("P50");
    }

    @Override
    public Tablet produceTablet() {
        return new HuaweiTablet("Matepad10.4");
    }
}
