package creational_patterns.builder;

public class LenovoBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        this.getComputer().setCpu("Lenovo CPU");
    }

    @Override
    public void buildMemory() {
        this.getComputer().setMemory("Lenovo 500G memory");
    }

    @Override
    public void buildDisplay() {
        this.getComputer().setDisplay("Lenovo 2048k * 1680k monitor");
    }

    @Override
    public void buildKeyboard() {
        this.getComputer().setKeyboard("Lenovo keyboard");
    }
}
