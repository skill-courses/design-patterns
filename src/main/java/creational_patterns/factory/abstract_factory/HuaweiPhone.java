package creational_patterns.factory.abstract_factory;

public class HuaweiPhone extends Phone{
    public HuaweiPhone(String name) {
        super(name);
    }

    @Override
    public void producePhone() {
        System.out.println("生产华为手机：" + this.name);
    }
}
