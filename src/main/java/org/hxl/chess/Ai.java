package org.hxl.chess;

import org.hxl.dto.MoveAction;

public class Ai {
    Chess chess;

    MoveAction play(MoveAction moveAction) {
        MoveAction toMove = new MoveAction();
        //todo:calculate

        chess.domove(toMove);
        return toMove;
    }

}
