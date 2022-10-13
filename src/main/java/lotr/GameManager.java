package lotr;

public class GameManager {
        public static void fight(Character c1, Character c2){
        boolean kickFirst = true;

        if (c1 instanceof Elf && c2 instanceof Elf){
            System.out.println("What a luck to see 2 Elfs...");
            return;
        }
        while(c1.isAlive() && c2.isAlive()){
            System.out.println("Characters information:");
            System.out.println("Player 1: " + c1);
            System.out.println("Player 2: " + c2);
            System.out.println("\nNew Round started");
            if (kickFirst) {
                c1.kick(c2);
                System.out.println("Player 1: "+c1.getClass().getSimpleName()+" - kicked Player 2:  "+ c2.getClass().getSimpleName());
            } else {
                c2.kick(c1);
                System.out.println(c2.getClass().getSimpleName()+" - kicked "+ c1.getClass().getSimpleName());
            }
            kickFirst = !kickFirst;
            if (!c1.isAlive()){
                System.out.println("\nPlayer2 - "+ c2.getClass().getSimpleName()+" has won");
                return;
            }
            if (!c2.isAlive()){
                System.out.println("\nPlayer1 - "+ c1.getClass().getSimpleName()+" has won");
                return;
            }

        }
    }

    public static void fightExample(){
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}

