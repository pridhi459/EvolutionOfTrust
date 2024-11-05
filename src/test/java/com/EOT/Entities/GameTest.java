package com.EOT.Entities;

import com.EOT.Players.Cheater;
import com.EOT.Players.Cooperater;
import com.EOT.Players.CopyCat;
import com.EOT.Players.Player;
import com.EOT.enums.MoveType;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GameTest {

    @Test
    void testGameForBothPlayersCooperate() {
        Player player1 = new Cooperater();
        Player player2 = new Cooperater();
        Game game = new Game(player1, player2);

        game.play(5,player1,player2);
        assertEquals(player1.getCoins(),10);

    }

    @Test
    void testGameForBothPlayersCheat() {
        Player player1 = new Cheater();
        Player player2 = new Cheater();
        Game game = new Game();

        game.play(5,player1,player2);

        assertEquals(player1.getCoins(),0);
        assertEquals(player2.getCoins(),0);
    }


//
//    @Test
//    void testGameForPlayer1CooperatePlayer2Cheat() {
//        Player player1 = new Cooperater();
//        Player player2 = new Cheater();
//        Game game = new Game(player1, player2);
//
//        assertEquals(game.play(5), Arrays.asList(-1, 3));
//    }
//
//    @Test
//    void testGameForBothPlayersCheatFor5Rounds() {
//        Player player1 = new Cheater();;
//        Player player2 = new Cheater();
//        Game game = spy(new Game(player1, player2));
//        List<Integer> li = game.play(5);
//
//        verify(game, times(5)).doMove(MoveType.CHEAT, MoveType.CHEAT);
//        assertEquals(li, Arrays.asList(0, 0));
//    }
//
//    @Test
//    void testGameForBothPlayersCooperateFor5Rounds() {
//        Player player1 = new Cooperater();
//        Player player2 = new Cooperater();
//        Game game = spy(new Game(player1, player2));
//        List<Integer> li = game.play(5);
//
//        verify(game, times(5)).doMove(MoveType.COOPERATE, MoveType.COOPERATE);
//        assertEquals(li, Arrays.asList(10, 10));
//    }
//
//    @Test
//    void testGameForPlayer1CheatsPlayer2CooperateFor5Rounds() {
//        Player player1 = new Cheater();
//        Player player2 = new Cooperater();
//        Game game = spy(new Game(player1, player2));
//
//
//        List<Integer> li = game.play(5);
//        verify(game, times(5)).doMove(MoveType.CHEAT, MoveType.COOPERATE);
//        assertEquals(li, Arrays.asList(15, -5));
//    }



}