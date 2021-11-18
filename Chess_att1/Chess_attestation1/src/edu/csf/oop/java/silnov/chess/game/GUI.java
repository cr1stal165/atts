package edu.csf.oop.java.silnov.chess.game;

import edu.csf.oop.java.silnov.chess.functional.Field;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import edu.csf.oop.java.silnov.chess.board.Cell;

public class GUI {

    public void installationImages(Field field) {
        for (Cell cell : field.getBoard().getGraph()) {
            if (cell.getFigure() != null) {
                Image img = new Image("File:images/" + (cell.getFigure().getColor().equals(Color.BLACK)
                        ? "B"
                        : "W") + cell.getFigure().getName() + ".png");
                ImageView imageView = new ImageView();
                imageView.setImage(img);
                field.getRoot().add(imageView, cell.getFigure().getPosition().charAt(0), Character.getNumericValue(cell.getFigure().getPosition().charAt(1)));
                imageView.fitHeightProperty().bind(field.getRoot().heightProperty().divide(field.getBoard().getSizeBoard()));
                imageView.fitWidthProperty().bind(field.getRoot().widthProperty().divide(field.getBoard().getSizeBoard()));
            }
        }
    }
}
