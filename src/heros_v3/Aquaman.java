package heros_v3;

class Aquaman extends Superhero {

    Aquaman(String name){
        super(name);
    }
    @Override
    public void useSuperPower() {
        System.out.println(this.getName() + " causes a tidal wave");
    }
}
