package creational_patterns.factory.abstract_factory;

public class ApplePhone extends Phone{
    public ApplePhone(String name) {
        super(name);
    }

    @Override
    public void producePhone() {
        System.out.println("生产苹果手机：" + this.name);
    }
}
