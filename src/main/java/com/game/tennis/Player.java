package com.game.tennis;

import java.util.Arrays;
import java.util.List;

/**
 * Class representing a player
 * 
 * @author Jay
 *
 */
public class Player {

    public static final List<Score> ScoreList = Arrays.asList(Score.LOVE, Score.FIFTEEN, Score.THIRTY, Score.FORTY);

    private int point;
    private String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPoint() {
        return point;
    }
    
    public void winPoint() {
        this.point += 1;
    }

    /**
     * Get the present score of the given player
     * 
     * @return score
     */
    public Score getScore() {
        return ScoreList.get(point);
    }

}