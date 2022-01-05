package creational_patterns.factory.abstract_factory;

public class AppleFactory implements ProductFactory {

    @Override
    public Phone producePhone() {
        return new ApplePhone("Iphone13");
    }

    @Override
    public Tablet produceTablet() {
        return new AppleTablet("Ipad4");
    }
}
