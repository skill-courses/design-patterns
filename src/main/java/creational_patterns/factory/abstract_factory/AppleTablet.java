package creational_patterns.factory.abstract_factory;

public class AppleTablet extends Tablet{
    public AppleTablet(String name) {
        super(name);
    }

    @Override
    public void produceTablet() {
        System.out.println("生产苹果平板：" + this.name);
    }
}
