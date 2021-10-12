package edu.csf.oop.java.chess.functional;

import edu.csf.oop.java.chess.board.Board;
import edu.csf.oop.java.chess.board.Figure;
import edu.csf.oop.java.chess.piece.*;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private final Board board;
    private final List<Figure> figureBoard = new ArrayList<>();

    public Match() {
        board = new Board(8, 8);
        installationFigures();
    }

    public ChessFigure[][] getFigures() {
        ChessFigure[][] mat = new ChessFigure[board.getRows()][board.getCols()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                mat[i][j] = (ChessFigure) board.figure(i, j);
            }
        }
        return mat;
    }

    private void figurePosition(char column, int row, ChessFigure figure) {
        board.placeFigure(figure, new FigurePosition(column, row).figurePosition());
        figureBoard.add(figure);
    }

    private void installationFigures() {
        figurePosition('a', 1, new Rook(board, PieceColor.WHITE));
        figurePosition('b', 1, new Knight(board, PieceColor.WHITE));
        figurePosition('c', 1, new Bishop(board, PieceColor.WHITE));
        figurePosition('d', 1, new Queen(board, PieceColor.WHITE));
        figurePosition('e', 1, new King(board, PieceColor.WHITE));
        figurePosition('f', 1, new Bishop(board, PieceColor.WHITE));
        figurePosition('g', 1, new Knight(board, PieceColor.WHITE));
        figurePosition('h', 1, new Rook(board, PieceColor.WHITE));
        figurePosition('a', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('b', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('c', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('d', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('e', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('f', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('g', 2, new Pawn(board, PieceColor.WHITE));
        figurePosition('h', 2, new Pawn(board, PieceColor.WHITE));

        figurePosition('a', 8, new Rook(board, PieceColor.BLACK));
        figurePosition('b', 8, new Knight(board, PieceColor.BLACK));
        figurePosition('c', 8, new Bishop(board, PieceColor.BLACK));
        figurePosition('d', 8, new Queen(board, PieceColor.BLACK));
        figurePosition('e', 8, new King(board, PieceColor.BLACK));
        figurePosition('f', 8, new Bishop(board, PieceColor.BLACK));
        figurePosition('g', 8, new Knight(board, PieceColor.BLACK));
        figurePosition('h', 8, new Rook(board, PieceColor.BLACK));
        figurePosition('a', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('b', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('c', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('d', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('e', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('f', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('g', 7, new Pawn(board, PieceColor.BLACK));
        figurePosition('h', 7, new Pawn(board, PieceColor.BLACK));
    }
}
