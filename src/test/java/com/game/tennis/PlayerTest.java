package com.game.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test for the Player class
 * 
 * @author Jay
 *
 */
public class PlayerTest {

    @Test
    public void testPointsCalculation() {
    	
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        
        for(int i=1; i<=3; i++){
        	player1.winPoint();
        }
        
        for(int i=1; i<=4; i++){
        	player2.winPoint();
        }
        
        assertEquals(player1.getPoint(), 3);
        assertEquals(player2.getPoint(), 4);        
    }
}
