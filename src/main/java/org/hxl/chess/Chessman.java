package org.hxl.chess;

public abstract class Chessman {
    String name;
    boolean side;
    int positionX;
    int positionY;

    abstract boolean canMove();
}
