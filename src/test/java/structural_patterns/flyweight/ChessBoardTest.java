package structural_patterns.flyweight;

import basic.BasicTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest extends BasicTest{
    private static ChessBoard chessBoard;

    @BeforeAll
    public static void init() {
        chessBoard = new ChessBoard(10, 10);
    }

    @Test
    void should_can_draw_chess_board() {
        chessBoard.play(1, 1);
        chessBoard.play(3, 4);
        chessBoard.play(5, 6);
        chessBoard.play(8, 7);
        chessBoard.play(4, 3);
        chessBoard.play(2, 3);
        chessBoard.play(5, 3);
        chessBoard.play(6, 6);
        chessBoard.drawChessBoard();

        assertEquals("""
                  0 1 2 3 4 5 6 7 8 9
                0 ┌─┬─┬─┬─┬─┬─┬─┬─┬─┐
                1 ├─◉─┼─┼─┼─┼─┼─┼─┼─┤
                2 ├─┼─┼─◯─┼─┼─┼─┼─┼─┤
                3 ├─┼─┼─┼─◯─┼─┼─┼─┼─┤
                4 ├─┼─┼─◉─┼─┼─┼─┼─┼─┤
                5 ├─┼─┼─◉─┼─┼─◉─┼─┼─┤
                6 ├─┼─┼─┼─┼─┼─◯─┼─┼─┤
                7 ├─┼─┼─┼─┼─┼─┼─┼─┼─┤
                8 ├─┼─┼─┼─┼─┼─┼─◯─┼─┤
                9 └─┴─┴─┴─┴─┴─┴─┴─┴─┘
                """, outputStreamCaptor.toString());
    }
}