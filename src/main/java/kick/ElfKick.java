package kick;

import lotr.Character;

public class ElfKick extends BasicKick {
    public void kick(Character whoKick, Character whoIsKicked){
            if (whoIsKicked.getPower() < whoKick.getPower()){
                whoIsKicked.setHp(0);
            } else {
                whoIsKicked.setPower(whoIsKicked.getPower()-1);
            }
    }
}
