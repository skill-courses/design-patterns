package creational_patterns.factory.simple_factory;

public class Phone extends Product{
    public Phone(String name) {
        super(name);
    }

    @Override
    public void produce() {
        System.out.println("手机：" + this.name + "已经生产完成！");
    }
}
