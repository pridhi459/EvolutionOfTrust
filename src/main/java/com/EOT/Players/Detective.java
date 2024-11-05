package com.EOT.Players;

import com.EOT.enums.MoveType;

import java.util.*;

public class Detective extends Player{

    private List<MoveType> initialMoves = new ArrayList<>(Arrays.asList
            (MoveType.COOPERATE, MoveType.CHEAT, MoveType.COOPERATE, MoveType.COOPERATE)
    );
    private MoveType oppMove=null;

    @Override
    public MoveType makeMove(MoveType opponentMove, Player opponent) {
        if(!initialMoves.isEmpty()){
            MoveType move = initialMoves.get(0);
            initialMoves.remove(0);
            return move;
        }
        else{
            return opponentMove;
        }
    }

    @Override
    public MoveType getMove() {
        return null;
    }
}
