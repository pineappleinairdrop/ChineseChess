package org.hxl.chess;

import org.hxl.dto.MoveAction;

public class Chess {
    //todo:change array index
    Chessman[][] chessmen = new Chessman[9][10];

    void domove(MoveAction move) {
        chessmen[0][0] = chessmen[0][1];
        //todo: to implement the business logic
    }
}
