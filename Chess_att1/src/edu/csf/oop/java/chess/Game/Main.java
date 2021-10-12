package edu.csf.oop.java.chess.Game;

import edu.csf.oop.java.chess.functional.Match;
import edu.csf.oop.java.chess.logging.Log;

public class Main {

    public static void main(String[] args) {
        Log.logging();
        Match match = new Match();
        GUI.printGame(match);
    }
}
