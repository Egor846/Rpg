public class Player extends Creature {

    final String name;
    public void setName(){

    }
    public Player(String name, int health, int power, int agility, int gold, int exp){
        super(name, health, power);
        this.name = name;
        this.health = health;
        this.power = power;

    }

}
