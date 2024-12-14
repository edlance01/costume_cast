package heros_v4;

class Aquaman extends Superhero {

    Aquaman(String name){
        super(name);
    }
    @Override
    public void useSuperPower() {
        System.out.println(this.getName() + " causes a tidal wave");
    }
}
