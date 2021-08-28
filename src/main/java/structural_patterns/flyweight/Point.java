package structural_patterns.flyweight;

public enum Point {
    CENTER("┼─"), TOP("┬─"), LEFT_TOP("┌─"), RIGHT_TOP("┐"), LEFT("├─"), RIGHT("┤"), BOTTOM("┴─"), LEFT_BOTTOM("└─"), RIGHT_BOTTOM("┘");
    private final String value;

    Point(String value) {
        this.value = value;
    }

    public void draw() {
        System.out.print(this.value);
    }
}
