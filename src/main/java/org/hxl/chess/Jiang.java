package org.hxl.chess;

public class Jiang extends Chessman{
    Jiang(boolean side,String name,int X,int Y){
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
