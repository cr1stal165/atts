package edu.csf.oop.java.silnov.chess.functional;

import edu.csf.oop.java.silnov.chess.board.Board;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field {

    private final GridPane root;
    private final Board board;

    public Field() {
        board = new Board();
        root = new GridPane();
        for (int row = board.getSizeBoard(); row >= 1; row--) {
            for (char col = 'A'; col <= 'H'; col++) {
                Rectangle square = new Rectangle();
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.LIGHTYELLOW);
                } else {
                    square.setFill(Color.BROWN);
                }
                root.add(square, col, row);
                square.widthProperty().bind(root.widthProperty().divide(board.getSizeBoard()));
                square.heightProperty().bind(root.heightProperty().divide(board.getSizeBoard()));
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public GridPane getRoot() {
        return root;
    }

}
