package com.game.tennis;

/**
 * Class to simulate a simple tennis game
 * 
 * @author Jay
 *
 */
public class TennisGame {

	private Player player1;
	private Player player2;

	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	/**
	 * Get the score of the game at any time
	 * 
	 * @return formatted readable score
	 * 
	 */
	public String getScore() {
		
		if (player1.getPoint() >= 3 && player2.getPoint() >= 3) {
			
			if (Math.abs(player2.getPoint() - player1.getPoint()) >= 2) {
				return getLeadingPlayer().getName() + " wins";
			} 
			else if (player1.getPoint() == player2.getPoint()) {
				return Score.DEUCE.toString();
			} 
			else {
				return  Score.ADVANTAGE.toString() + " " + getLeadingPlayer().getName();
			}
		} 
		else {
			return player1.getScore() + ", "	+ player2.getScore();
		}
	}

	/**
	 * Get the player who is leading a game
	 * 
	 * @return player in lead
	 * 
	 */
	public Player getLeadingPlayer() {
		
		if(player1.getPoint() > player2.getPoint()){
			return player1;
		}
		else{
			return player2;
		}
	}

}
