package edu.csf.oop.java.chess.piece;

import edu.csf.oop.java.chess.board.Board;
import edu.csf.oop.java.chess.functional.ChessFigure;
import edu.csf.oop.java.chess.functional.PieceColor;

public class King extends ChessFigure {

    @Override
    public String toString() {
        if(getColor() == PieceColor.WHITE){
            return "K";
        }
        return "k";
    }

    public King(Board board, PieceColor pieceColor) {
        super(board, pieceColor);
    }
}
