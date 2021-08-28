package structural_patterns.flyweight;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChessPiece {
    private int x;
    private int y;
    private ChessPieceType type;

    public ChessPiece(ChessPieceType type) {
        this.type = type;
    }

    public void draw() {
        System.out.print(type.getValue() + "─");
    }
}
