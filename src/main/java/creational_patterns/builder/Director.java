package creational_patterns.builder;

import java.util.Locale;

public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildComputer() {
        this.builder.createComputer();
        this.builder.buildCPU();
        this.builder.buildDisplay();
        this.builder.buildMemory();
        this.builder.buildKeyboard();
        return this.builder.getComputer();
    }
}
