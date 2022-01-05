package creational_patterns.factory.abstract_factory;

public class HuaweiTablet extends Tablet{
    public HuaweiTablet(String name) {
        super(name);
    }

    @Override
    public void produceTablet() {
        System.out.println("生产华为平板：" + this.name);
    }
}
