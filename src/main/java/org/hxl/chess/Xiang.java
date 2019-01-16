package org.hxl.chess;

public class Xiang extends Chessman {
    Xiang(boolean side,String name,int X,int Y){
        this.side=side;
        this.name=name;
        this.positionX=X;
        this.positionY=Y;
    }
    @Override
    boolean canMove() {
        return false;
    }
}
