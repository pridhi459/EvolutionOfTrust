package com.EOT.Entities;

import com.EOT.Players.Cheater;
import com.EOT.Players.Cooperater;
import com.EOT.Players.Player;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {

    @Test
    void TestTournamentBetween3Players(){
        Player cooperater1 = new Cooperater();
        Player cheater1= new Cheater();
        Player cooperater2 = new Cooperater();

        Tournament tournament = new Tournament(List.of(cooperater1, cheater1, cooperater2));

        Player winner = tournament.begin();

        assertEquals(winner, cheater1);
    }


}