package heros_v2;

class Superman extends Superhero {

    Superman(String name){
        super(name);
    }

    @Override
    public void useSuperPower() {
        System.out.println( this.getName() + " uses heat vision");
    }
}
