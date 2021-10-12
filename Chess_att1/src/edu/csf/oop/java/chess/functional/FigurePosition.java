package edu.csf.oop.java.chess.functional;

import edu.csf.oop.java.chess.board.Position;

public class FigurePosition {

    private final char col;
    private final int row;

    public FigurePosition(char col, int row) {
        this.col = col;
        this.row = row;
    }

    protected Position figurePosition() {
        return new Position(8 - row, col - 'a');
    }

    @Override
    public String toString() {
        return "" + col + row;
    }
}