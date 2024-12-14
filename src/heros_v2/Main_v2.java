package heros_v2;

import java.util.ArrayList;
import java.util.List;

public class Main_v2 {
    public static void main(String[] args) {

        List<Superhero> superheros = new ArrayList<>();
        superheros.add(new Superman("Superman"));
        superheros.add(new WonderWoman("Wonder Woman"));
        superheros.add(new Aquaman("Aquaman"));

        for (Superhero superhero : superheros){
            superhero.useSuperPower();
            superhero.rest();
        }

        /*challenge - what happens in the above loop if we add
         another superhero who has useSuperPower and rest? */


    }
}