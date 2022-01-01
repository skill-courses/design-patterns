package creational_patterns.prototype;

public class Sheep implements Cloneable {
    private String color;
    private String name;
    private Double weight;

    public Sheep(String color, String name, Double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Sheep() {
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = new Sheep();
        sheep.color = this.color;
        sheep.name = this.name;
        sheep.weight = this.weight;
        return sheep;
    }
}
