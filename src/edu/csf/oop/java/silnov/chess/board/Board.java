package edu.csf.oop.java.silnov.chess.board;

public class Board {

    private final int SIZE_BOARD = 8;
    private final Graph<Cell> graph;

    public Board() {
        graph = new Graph<>();
        for (int row = SIZE_BOARD; row >= 1; row--) {
            for (char col = 'A'; col <= 'H'; col++) {
                graph.addVertex(new Cell("" + col + row, null));
            }
        }
    }

    public int getSizeBoard() {
        return SIZE_BOARD;
    }

    public Graph<Cell> getGraph() {
        return graph;
    }

}
