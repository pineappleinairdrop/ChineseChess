package org.hxl.chess.chessman;

public class Bing extends Chessman {
    Bing(int X, int Y) {
        this.side = true;
        this.name = "兵";
        this.positionX = X;
        this.positionY = Y;
        this.bylaw = new int[2][3];
    }

    private boolean isCrossed() {
        return positionY <= 4;
    }
//    @Override
//    boolean nextWithinBound() {
//        if(0<=positionY&&positionY<=4)
//        return false;
//    }

    @Override
    void next() {
        if (!isCrossed()) {
            nextY = positionY - 1;
            if (canMove()) {
                bylaw[0][0] = positionX;
                bylaw[1][0] = nextY;
            }
        } else {
            nextY = positionY - 1;
            if (canMove()) {
                bylaw[0][0] = positionX;
                bylaw[1][0] = nextY;
            }
            nextX = positionX - 1;
            if (canMove()) {
                bylaw[0][1] = nextX;
                bylaw[1][1] = positionY;
            }
            nextX = positionX + 1;
            if (canMove()) {
                bylaw[0][1] = nextX;
                bylaw[1][1] = positionY;
            }
        }
    }
}
