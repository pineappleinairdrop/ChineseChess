package org.hxl.chess.chessman;

import org.hxl.chess.Chess;

public abstract class Chessman {
    String name;
    boolean side;
    int positionX;
    int positionY;
    int nextX;
    int nextY;
    int[][] bylaw;

    boolean canMove() {
        return nextWithinBound() && !Chess.isBlockedByAlly();
    }

    abstract void next();

//    boolean isBlocedByAlly() {
//        return false;
//    }

    boolean nextWithinBound() {
        return 0 <= nextX && nextX < 9 && 0 <= nextY && nextY < 10;
    }
}
