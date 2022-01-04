package creational_patterns.factory.simple_factory;

public class SimpleFactory {
    public Product produceProduct(String productName) {
        if (productName.contains("手机")) {
            return new Phone(productName);
        }

        if (productName.contains("平板")) {
            return new Tablet(productName);
        }

        return null;
    }
}
