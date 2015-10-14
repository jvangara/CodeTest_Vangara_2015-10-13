package com.game.tennis;

/**
 * Enumeration of scores in a tennis game
 * 
 * @author Jay
 *
 */
public enum Score {
	
	LOVE("love"), 
	FIFTEEN("fifteen"), 
	THIRTY("thirty"), 
	FORTY("forty"), 
	DEUCE("deuce"), 
	ADVANTAGE("advantage");

	private final String name;

	private Score(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}
}