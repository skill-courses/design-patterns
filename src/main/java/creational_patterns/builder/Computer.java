package creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String cpu;
    private String memory;
    private String display;
    private String keyboard;

    @Override
    public String toString() {
        return "PC:" + this.cpu + ", " + this.memory + ", " + this.display + ", " + this.keyboard;
    }
}
