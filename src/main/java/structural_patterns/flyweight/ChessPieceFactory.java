package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {
    private static final Map<String, ChessPiece> chessPieceMap = new HashMap<>();

    public static ChessPiece generateChessPiece(int x, int y) {
        String id = x + "-" + y;
        if (chessPieceMap.get(id) != null) {
            return chessPieceMap.get(id);
        }

        long blackChessPieceCount = chessPieceMap.values().stream().filter(cp -> cp.getType() == ChessPieceType.BLACK).count();
        long whiteChessPieceCount = chessPieceMap.values().size() - blackChessPieceCount;
        ChessPiece chessPiece = new ChessPiece(whiteChessPieceCount >= blackChessPieceCount ? ChessPieceType.BLACK : ChessPieceType.WHITE);
        chessPiece.setX(x);
        chessPiece.setY(y);
        chessPieceMap.put(id, chessPiece);
        return chessPiece;
    }
}
