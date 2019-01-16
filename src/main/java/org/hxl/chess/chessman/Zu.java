package org.hxl.chess.chessman;

public class Zu extends Chessman {
    Zu(int X, int Y) {
        this.side = false;
        this.name = "卒";
        this.positionX = X;
        this.positionY = Y;
        this.bylaw = new int[2][3];
    }

    private boolean isCrossed() {
        return positionY >= 5;
    }

    @Override
    void next() {
        if (!isCrossed()) {
            nextY = positionY + 1;
            if (canMove()) {
                bylaw[0][0] = positionX;
                bylaw[1][0] = nextY;
            }
        } else {
            nextY = positionY + 1;
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
                bylaw[0][2] = nextX;
                bylaw[1][2] = positionY;
            }
        }
    }
}
