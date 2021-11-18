package edu.csf.oop.java.silnov.chess.board;

import javafx.scene.paint.Color;

public abstract class Figure {

    private String position;
    private final String name;
    private final Color color;

    protected Figure(Color color, String position, String name) {
        this.color = color;
        this.position = position;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

}
