package com.EOT.Entities;

import com.EOT.Players.Player;
import com.EOT.enums.MoveType;

import java.util.*;

public class Game {

    // private final EotMachine eotMachine = new EotMachine();
    private Player player1;
    private Player player2;
    private MoveType player1Move=null;
    private MoveType player2Move= null;

    private static Map<List<MoveType>, List<Integer>> scoreMatrix = new HashMap<>();

    public Game() {

        scoreMatrix.put(Arrays.asList(MoveType.COOPERATE, MoveType.COOPERATE), Arrays.asList(2, 2));
        scoreMatrix.put(Arrays.asList(MoveType.CHEAT, MoveType.CHEAT), Arrays.asList(0, 0));
        scoreMatrix.put(Arrays.asList(MoveType.CHEAT, MoveType.COOPERATE), Arrays.asList(3, -1));
        scoreMatrix.put(Arrays.asList(MoveType.COOPERATE, MoveType.CHEAT), Arrays.asList(-1, 3));
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

//    private List<Integer> doMove(MoveType firstMove, MoveType secondMove) {
//        List<Integer> coins = this.transact(Arrays.asList(firstMove, secondMove));
//
//        player1.updateScore(coins.get(0));
//        player2.updateScore(coins.get(1));
//
//        return coins;
//    }

    public void play(int rounds, Player player1, Player player2) {
        for (int i = 0; i < rounds; i++) {
            if(i==0){
                player1Move=player1.makeMove(null, player2);
                player2Move=player2.makeMove(null, player1);
            }
            player1Move=player1.makeMove(player2Move, player2);
            player2Move=player2.makeMove(player1Move, player1);

        }
        //return Arrays.asList(player1.getCoins(), player2.getCoins());
    }


    List<Integer> transact(List<MoveType> moves) {
        System.out.println("Transacting");
        return scoreMatrix.get(moves);
    }
}