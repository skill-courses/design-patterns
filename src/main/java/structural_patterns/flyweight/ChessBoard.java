package structural_patterns.flyweight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChessBoard {
    private final int row;
    private final int column;
    private final Set<ChessPiece> chessPieces = new HashSet<>();

    public ChessBoard(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void play(int x, int y) {
        ChessPiece chessPiece = ChessPieceFactory.generateChessPiece(x, y);
        chessPieces.add(chessPiece);
    }

    public void drawChessBoard() {
        String topBoard = IntStream.range(0, row).mapToObj(String::valueOf).collect(Collectors.joining(" ", "  ", ""));
        System.out.println(topBoard);
        IntStream.range(0, row).forEach(rowIndex -> {
            System.out.print(rowIndex + " ");
            IntStream.range(0, column).forEach(columnIndex -> chessPieces.stream().filter(chessPiece -> chessPiece.getX() == rowIndex && chessPiece.getY() == columnIndex).findFirst().ifPresentOrElse(ChessPiece::draw, () -> {
                Point point = getPoint(rowIndex, columnIndex);
                point.draw();
            }));
            System.out.println();
        });
    }

    private Point getPoint(int x, int y) {
        if (x == 0 && y == 0) return Point.LEFT_TOP;
        if (x == 0 && y == column - 1) return Point.RIGHT_TOP;
        if (x == row -1 && y == 0) return Point.LEFT_BOTTOM;
        if (x == row -1 && y == column -1) return Point.RIGHT_BOTTOM;
        if (x == 0 && y > 0 && y < column) return Point.TOP;
        if (x == row -1  && y > 0 && y < column) return Point.BOTTOM;
        if (y == 0 && x > 0 && x < row) return Point.LEFT;
        if (y == column -1 && x > 0 && x < row) return Point.RIGHT;
        return Point.CENTER;
    }
}
