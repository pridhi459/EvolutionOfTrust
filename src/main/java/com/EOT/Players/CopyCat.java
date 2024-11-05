package com.EOT.Players;

import com.EOT.enums.MoveType;

public class CopyCat extends Player{
    private MoveType oppLastMove = null;

    @Override
    public MoveType makeMove( MoveType opponentMove , Player opponent) {
        if(opponentMove == null){
            return MoveType.COOPERATE;
        }
        else{
            oppLastMove = opponentMove;
        }
        return oppLastMove;
    }
    @Override
    public void updateScoreWithOpponentMove(MoveType opponentMove) {

    }

    @Override
    public MoveType getMove() {
        return null;
    }
}
