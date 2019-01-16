package org.hxl.chess;

import org.hxl.chess.chessman.Chessman;
import org.hxl.dto.MoveAction;

public class Chess {
    //todo:change array index
    Chessman[][] chessmen = new Chessman[9][10];

    public static boolean isBlockedByAlly() {
        return false;
    }

    void remove(int X, int Y) {
        chessmen[X][Y] = null;
    }

    void domove(MoveAction move) {
        chessmen[move.newX][move.newY] = chessmen[move.oldX][move.oldY];
        remove(move.oldX, move.oldY);
        //todo: to implement the business logic
    }
}
