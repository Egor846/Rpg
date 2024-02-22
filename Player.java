
public class Player extends Creature {

    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName() {
        Player.name = ConsoleCommands.scanner.nextLine();
    }

    public Player(String name, int health, int power, int agility, int gold, int exp){
        super(name, health, power);
        this.name = name;
        this.health = health;
        this.power = power;

    }

}

