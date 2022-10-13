package lotr;

import kick.BasicKick;
import lombok.Getter;

@Getter
public abstract class Character {
    private int power;
    private  int hp;
    protected BasicKick kickFormat;


    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }

    public boolean isAlive(){
        return getHp() > 0;
    }
    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
    public void setPower(int power){this.power = Math.max(power, 0);}

//    public void kick(Character c){}
    public void kick(Character c){ kickFormat.kick(this, c);}

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

}
