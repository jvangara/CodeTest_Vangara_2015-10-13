package com.game.tennis;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for TennisGame class 
 * 
 * @author Jay
 *
 */
public class TennisGameTest {
	 
    private Player player1;
    private Player player2;
    private TennisGame game;
 
    @Before
    public void beforeGameTest() {
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        game = new TennisGame(player1, player2);
    }
 
    @Test
    public void loveShouldIndicateScore0() {
        TennisGame game = new TennisGame(player1, player2);
        assertThat(game, hasProperty("score", is("love, love")));
    }
 
    @Test
    public void fifteenShouldIndicateScore1() {
        player2.winPoint();
        assertThat(game, hasProperty("score", is("love, fifteen")));
    }
 
    @Test
    public void thirtyShouldIndicateScore2() {
        player1.winPoint();
        player1.winPoint();
        player2.winPoint();
        assertThat(game, hasProperty("score", is("thirty, fifteen")));
    }
 
    @Test
    public void fortyShouldIndicateScore3() {
    	
    	for(int i=1; i<=3; i++){
    		player1.winPoint();
    	}
    	
        assertThat(game, hasProperty("score", is("forty, love")));
    }
 
    @Test
    public void testAdvantage() {

    	for(int i=1; i<=3; i++){
    		player1.winPoint();
    	}
    	
    	for(int i=1; i<=4; i++){
    		player2.winPoint();
    	}
        
    	assertThat(game, hasProperty("score", is("advantage Player2")));
    }
 
    @Test
    public void testDeuce() {
    	
        for(int i = 1; i <= 3; i++) {
            player1.winPoint();
        }
        
        for(int i = 1; i <= 3; i++) {
            player2.winPoint();
        }
        
        game.getScore();
        
        assertThat(game, hasProperty("score", is("deuce")));
        player1.winPoint();
        assertThat(game, hasProperty("score", is(not("deuce"))));
        player2.winPoint();
        assertThat(game, hasProperty("score", is("deuce")));
    }
 
    @Test
    public void testWinner() { 
    	
        for(int i = 1; i <= 4; i++) {
            player1.winPoint();
        }
        
        for(int i = 1; i <= 3; i++) {
            player2.winPoint();
        }
        
        assertThat(game, hasProperty("score", is(not("Player1 won"))));
        assertThat(game, hasProperty("score", is(not("Player2 won"))));
        player1.winPoint();
//        assertThat(game, hasProperty("score", is("Player1 won")));
    }
 
}