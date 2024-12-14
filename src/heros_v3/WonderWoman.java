package heros_v3;

public class WonderWoman extends Superhero implements Flyable {

    WonderWoman(String name){
        super(name);
    }

    @Override
    public void useSuperPower() {
        System.out.println(this.getName() + " using lasso of truth");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " can fly hypersonic speeds up to 7,680 mph");
    }
}
