package structural_patterns.bridge;

public abstract class MilkTea {
    protected Temperature temperature;

    public MilkTea(Temperature temperature) {
        this.temperature = temperature;
    }

    public abstract void order(int count);
}
