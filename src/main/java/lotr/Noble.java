package lotr;

import kick.NobleKick;
import java.util.Random;

public abstract class Noble extends Character{
    private final static Random randomgenerator = new Random();
    public Noble(int min, int max){
        super(randomgenerator.nextInt(max-min+1) + min, randomgenerator.nextInt(max-min+1)+min);
        kickFormat = new NobleKick();
    }
}
