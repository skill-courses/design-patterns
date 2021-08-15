package structural_patterns.bridge;

public class SmallCup extends RefindeMilkTea{
    public SmallCup(Temperature temperature) {
        super(temperature);
    }

    @Override
    public String getSpecification() {
        return "小杯";
    }
}
