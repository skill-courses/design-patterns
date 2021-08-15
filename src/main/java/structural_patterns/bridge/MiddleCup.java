package structural_patterns.bridge;

public class MiddleCup extends RefindeMilkTea{
    public MiddleCup(Temperature temperature) {
        super(temperature);
    }

    @Override
    public String getSpecification() {
        return "中杯";
    }
}
