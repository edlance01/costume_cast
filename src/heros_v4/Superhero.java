package heros_v4;

import heros_v4.utils.Training;

abstract class Superhero {
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

    /* Challenge(s):
       1. How many different ways can we get Training
            -constructor, pass it in to our train method, look it up in a directory,
             create it ourselves
        2. Could train be static?  What are the good/bad consequences?
        3. Wouldn't it be nice if someone just made one for us and gave it to us at the right time?
    */
    void train(){
        new Training().train();
    }
}
