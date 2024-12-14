package heros_v4;

import java.util.ArrayList;
import java.util.List;

public class Main_v4 {
    public static void main(String[] args) {

        List<Superhero> superheros = new ArrayList<>();
        superheros.add(new Superman("Superman"));
        superheros.add(new WonderWoman("Wonder Woman"));
        superheros.add(new Aquaman("Aquaman"));

        for (Superhero superhero : superheros){
            superhero.useSuperPower();
            superhero.rest();
            superhero.train();

            //hmmm, how to handle downcast here...think "code to the ___ not the implementation".
            if (superhero instanceof Flyable){
                ((Flyable)superhero).fly();
            }

            System.out.println("______________________________");
        }


    }
}