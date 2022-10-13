package lotr;

import kick.BasicKick;
import kick.ElfKick;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
        kickFormat = new ElfKick();
    }
}