package org.hxl.chess.chessman;

public class Shi extends Chessman {
    Shi(boolean side,int X,int Y){
        this.side=side;
        this.name="士";
        this.positionX=X;
        this.positionY=Y;
    }

    @Override
    void next() {

    }
}
