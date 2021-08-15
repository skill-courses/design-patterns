package structural_patterns.bridge;

public class Rocks implements Temperature{
    @Override
    public String choiceTemperature() {
        return "加冰";
    }
}
