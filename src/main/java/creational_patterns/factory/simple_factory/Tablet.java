package creational_patterns.factory.simple_factory;

public class Tablet extends Product{
    public Tablet(String name) {
        super(name);
    }

    @Override
    public void produce() {
        System.out.println("平板：" + this.name + "已经生产完成！");
    }
}
