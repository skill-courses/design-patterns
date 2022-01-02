package creational_patterns.builder;

public class MacBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        this.getComputer().setCpu("MAC cpu");
    }

    @Override
    public void buildMemory() {
        this.getComputer().setMemory("Apple 512G memory");
    }

    @Override
    public void buildDisplay() {
        this.getComputer().setDisplay("Apple 4000k * 2048k monitor");
    }

    @Override
    public void buildKeyboard() {
        this.getComputer().setKeyboard("Mac wireless keyboard");
    }
}
