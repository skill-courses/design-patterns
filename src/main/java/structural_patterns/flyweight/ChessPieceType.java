package structural_patterns.flyweight;

public enum ChessPieceType {
    BLACK("◉"), WHITE("◯");

    private final String value;

    ChessPieceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
