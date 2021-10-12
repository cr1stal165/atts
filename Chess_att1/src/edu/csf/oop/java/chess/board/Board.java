package edu.csf.oop.java.chess.board;

public class Board {

    private final int rows;
    private final int cols;
    private Figure[][] figures;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.figures = new Figure[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void placeFigure(Figure figure, Position position) {
        figures[position.getRow()][position.getCol()] = figure;
        figure.position = position;
    }

    public Figure figure(int row, int col) {
        return figures[row][col];
    }
}
