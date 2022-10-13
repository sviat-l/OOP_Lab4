package kick;

import lotr.Character;
import java.util.Random;

public class NobleKick extends BasicKick {
    final Random randomizer = new Random();

    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - randomizer.nextInt(whoKick.getPower()));
    }

}

