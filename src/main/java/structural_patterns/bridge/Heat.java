package structural_patterns.bridge;

public class Heat implements Temperature{
    @Override
    public String choiceTemperature() {
        return "加热";
    }
}
