package com.EOT.Players;

import com.EOT.enums.MoveType;

public abstract class Player {
    int coins=0;

    abstract public MoveType makeMove( MoveType opponentMove, Player opponent);

    public void updateScoreWithOpponentMove(MoveType opponentMove) {
       // if()
    }

    abstract public MoveType getMove();

    public int getCoins() {
        return coins;
    }
}
