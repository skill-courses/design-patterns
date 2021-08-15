package structural_patterns.bridge;

public interface Temperature {
    default String choiceTemperature() {
        return "常温";
    }
}
