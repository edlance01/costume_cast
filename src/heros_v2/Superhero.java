package heros_v2;

abstract class Superhero {
    private final String name;

    Superhero(String _name){
        this.name = _name;
    }

    String getName() {
        return name;
    }

    abstract void useSuperPower();

    void rest(){
        System.out.println(this.getName() + " is resting ");
    }
}
