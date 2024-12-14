package heros_v2;

public abstract class Superhero {
    private final String name;

    Superhero(String _name){
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    abstract void useSuperPower();

    void rest(){
        System.out.println(this.getName() + " is resting ");
    }
}
