package creational_patterns.builder;

public abstract class ComputerBuilder {
    private Computer pc;
    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildDisplay();
    public abstract void buildKeyboard();

    public void createComputer(){
        this.pc = new Computer();
    }
    public Computer getComputer(){
        return this.pc;
    }
}
