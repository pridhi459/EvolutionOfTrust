package com.EOT.Players;

import com.EOT.enums.MoveType;

public class Cooperater extends Player{




    @Override
    public MoveType makeMove(MoveType opponentMove , Player opponent) {
        return MoveType.COOPERATE;
    }

    @Override
    public MoveType getMove() {
        return null;
    }
}
