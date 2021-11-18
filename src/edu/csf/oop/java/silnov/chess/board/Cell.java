package edu.csf.oop.java.silnov.chess.board;

public class Cell {

    private final String position;
    private Figure figure;

    public Cell(String position, Figure figure) {
        this.position = position;
        this.figure = figure;
    }

    public String getPosition() {
        return position;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
