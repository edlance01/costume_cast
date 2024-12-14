package heros_v4;

class Superman extends Superhero implements Flyable {

    Superman(String name){
        super(name);
    }

    @Override
    public void useSuperPower() {
        System.out.println( this.getName() + " uses heat vision");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " can fly up to 660,000,000 mph");
    }
}
