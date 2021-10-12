package edu.csf.oop.java.chess.functional;

import edu.csf.oop.java.chess.board.Board;
import edu.csf.oop.java.chess.board.Figure;

public class ChessFigure extends Figure {

    private final PieceColor pieceColor;

    public ChessFigure(Board board, PieceColor pieceColor) {
        super(board);
        this.pieceColor = pieceColor;
    }

    public PieceColor getColor() {
        return pieceColor;
    }

}
