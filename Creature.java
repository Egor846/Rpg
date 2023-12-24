public abstract class Creature extends MapObject{
    protected int power;

    public Creature(String name, int health, int power){
        super(name, health);
        this.power = power;

    }


}
