/**
 * Created by erickloulou on 28/10/2016.
 */
import java.util.ArrayList;

public class Game {
    private int score = 0;
    public void roll(int pins){
        score += pins;


    }
    public int score(){
        return score;
    }
}