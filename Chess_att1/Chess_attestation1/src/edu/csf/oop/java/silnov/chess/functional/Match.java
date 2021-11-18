package edu.csf.oop.java.silnov.chess.functional;

import edu.csf.oop.java.silnov.chess.board.Board;
import edu.csf.oop.java.silnov.chess.board.Cell;
import edu.csf.oop.java.silnov.chess.game.GUI;
import edu.csf.oop.java.silnov.chess.piece.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Match extends Application {

    private final GUI GUI = new GUI();

    private static final Logger logger = LoggerFactory.getLogger(Match.class);

    public void start(Stage primaryStage) {
        Field field = new Field();
        installationFigures(field.getBoard());
        GUI.installationImages(field);
        primaryStage.setScene(new Scene(field.getRoot(), 700, 700));
        primaryStage.show();
    }

    private void installationFigures(Board board) {
        for (Cell cell : board.getGraph()) {
            if (cell.getPosition().equals("A8") || cell.getPosition().equals("H8") || cell.getPosition().equals("A1") || cell.getPosition().equals("H1")) {
                cell.setFigure(new Rook((cell.getPosition().equals("A8") || cell.getPosition().equals("H8"))
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            if (cell.getPosition().equals("B8") || cell.getPosition().equals("G8") || cell.getPosition().equals("B1") || cell.getPosition().equals("G1")) {
                cell.setFigure(new Knight((cell.getPosition().equals("B8") || cell.getPosition().equals("G8"))
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            if (cell.getPosition().equals("C8") || cell.getPosition().equals("F8") || cell.getPosition().equals("C1") || cell.getPosition().equals("F1")) {
                cell.setFigure(new Bishop((cell.getPosition().equals("C8") || cell.getPosition().equals("F8"))
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            if (cell.getPosition().equals("D8") || cell.getPosition().equals("D1")) {
                cell.setFigure(new Queen(cell.getPosition().equals("D8")
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            if (cell.getPosition().equals("E8") || cell.getPosition().equals("E1")) {
                cell.setFigure(new King(cell.getPosition().equals("E8")
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            if (cell.getPosition().charAt(1) == '7' || cell.getPosition().charAt(1) == '2') {
                cell.setFigure(new Pawn(cell.getPosition().charAt(1) == '7'
                        ? Color.BLACK
                        : Color.WHITE, cell.getPosition()));
            }
            try {
                logger.info("Фигура " + cell.getFigure().getName() + " была поставлена на " + cell.getPosition());
            } catch (Exception e) {
                logger.info("Клетка " + cell.getPosition() + " пуста");
            }
        }
    }
}
