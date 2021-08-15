package structural_patterns.bridge;

public abstract class RefindeMilkTea extends MilkTea{

    public RefindeMilkTea(Temperature temperature) {
        super(temperature);
    }

    @Override
    public void order(int count) {
        String temperature = this.temperature.choiceTemperature();
        System.out.println("已经为您订购" + count + getSpecification() + temperature + "奶茶！");
    }

    public abstract String getSpecification();
}
