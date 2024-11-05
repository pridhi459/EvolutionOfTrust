package com.EOT.Players;

import com.EOT.enums.MoveType;

public class Cheater extends Player{


    @Override
    public MoveType makeMove(MoveType opponentMove, Player opponent) {
        return MoveType.CHEAT;
    }

    @Override
    public MoveType getMove() {
        return null;
    }
}
