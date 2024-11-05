package com.EOT.Entities;

import com.EOT.Players.Player;

import java.util.*;

public class Tournament {
    private List<Player> players;
    private final Game game = new Game();
    private Player winner=null;

    public Tournament(List<Player> players) {
        this.players = players;
    }

    public Player begin() {
        while(winner==null){
        fight();
        eliminateLeast5();
        reProduceTop5();
        getWinner();
        }
        return winner;
    }

    private void fight() {
        for (Player p : players) {
            for (Player q : players) {
                if (p != q) {
                    game.play(5, p, q);
                }
            }
        }
    }

    private void eliminateLeast5() {
        players.sort(Comparator.comparing(Player::getCoins));
        players.subList(0, 5).clear();
    }

    private void reProduceTop5() {
        List<Player> newPlayers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            newPlayers.add(players.get(i));
            newPlayers.add(players.get(i));
        }
        players = newPlayers;
    }

    private void getWinner() {
        boolean singlePlayer = false;
        for (int i=0;i<players.size()-1;i++) {
            if (players.get(i).getClass()==players.get(i+1).getClass()) {
                singlePlayer=true;
            }
            else {
                singlePlayer=false;
                break;
            }
        }

        if (singlePlayer) {
            winner = players.get(0);
        }
    }
}
