package org.hxl.chess;

public class Shuai extends Chessman {
    @Override
    boolean canMove() {
        return false;
    }
    Shuai(boolean side,String name,int X,int Y){
        this.side=side;
        this.name=name;
        this.positionX=X;
        this.positionY=Y;
    }
}
