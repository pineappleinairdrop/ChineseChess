package org.hxl.chess.chessman;

public class Xiang extends Chessman {
    Xiang(boolean side, int X, int Y) {
        this.side = side;
        this.name = "相";
        this.positionX = X;
        this.positionY = Y;
    }

    @Override
    void next() {

    }
}
