package org.hxl.chess.chessman;


public class Shuai extends Chessman {

    @Override
    boolean nextWithinBound() {
        return 3 <= nextX && nextX <= 5 && 0 <= nextY && nextY <= 2;
    }

    @Override
    void next() {
        nextY = positionY + 1;
        if (canMove()) {
            bylaw[0][0] = positionX;
            bylaw[1][0] = nextY;
        }
        nextY = positionY - 1;
        if (canMove()) {
            bylaw[0][1] = positionX;
            bylaw[1][1] = nextY;
        }
        nextX = positionX + 1;
        if (canMove()) {
            bylaw[0][2] =nextX;
            bylaw[1][2] = positionY;
        }
        nextX = positionX - 1;
        if (canMove()) {
            bylaw[0][3] = nextX;
            bylaw[1][3] = positionY;
        }
    }

    Shuai() {
        this.bylaw = new int[2][4];
        this.side = true;
        this.name = "帅";
        this.positionX = 4;
        this.positionY = 9;
    }
}
