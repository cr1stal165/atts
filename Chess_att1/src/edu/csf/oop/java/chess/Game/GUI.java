package edu.csf.oop.java.chess.Game;

import edu.csf.oop.java.chess.functional.ChessFigure;
import edu.csf.oop.java.chess.functional.Match;
import edu.csf.oop.java.chess.functional.PieceColor;

public class GUI {


    public static void printGame(Match match) {
        printBoard(match.getFigures());
    }

    public static void printBoard(ChessFigure[][] figures) {

        System.out.println("   _________________");
        for (int i = 0; i < figures.length; i++) {
            System.out.print((8 - i)+ " | ");
            for (int j = 0; j < figures[i].length; j++) {
                printFigures(figures[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("   _________________");
        System.out.println("    a b c d e f g h");
    }

    public static void printFigures(ChessFigure figure) {
        if (figure == null) {
            System.out.print("-");
        } else {
            if (figure.getColor() == PieceColor.WHITE) {
                System.out.print(figure);
            } else {
                System.out.print(figure);

            }
        }
        System.out.print(" ");
    }

}

