package heros_v2;

public class WonderWoman extends Superhero {

    WonderWoman(String name){
        super(name);
    }

    @Override
    public void useSuperPower() {
        System.out.println(this.getName() + " using lasso of truth");
    }
}
