package structural_patterns.bridge;

public class BigCup extends RefindeMilkTea{
    public BigCup(Temperature temperature) {
        super(temperature);
    }

    @Override
    public String getSpecification() {
        return "大杯";
    }
}
