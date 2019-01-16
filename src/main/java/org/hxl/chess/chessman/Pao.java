package org.hxl.chess.chessman;

public class Pao extends Chessman {
    Pao(boolean side, int X, int Y) {
        this.side = side;
        this.name = "炮";
        this.positionX = X;
        this.positionY = Y;
    }


    @Override
    void next() {

    }
}
