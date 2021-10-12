package edu.csf.oop.java.chess.board;

public class Figure {

    protected Position position;
    protected Board board;

    public Figure(Board board) {
        this.board = board;
        this.position = null;
    }
}
