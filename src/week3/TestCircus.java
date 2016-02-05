package week3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Iurii on 05.02.2016.
 */
public class TestCircus {
    public static void main(String[] args) {
        Circus shapito = new Circus();
        shapito.openTest();
        //shapito.printArtist();
        System.out.println();
        System.out.println("Artists count = 3? " + (shapito.getArtists().size()==3) );

        shapito.getArtists().get(2).act();
        shapito.getArtists().get(1).act();
        shapito.getArtists().get(0).act();
        System.out.println("Looks Zhora didnt act ? " + (shapito.getArtists().get(1).getActCount()==0));

        shapito.getArtists().get(2).buhat("vodka",2);
        shapito.getArtists().get(1).buhat("vine",0.5);
        shapito.getArtists().get(0).buhat("beer",3);
        System.out.println("What is the value for Ira? 0.5 * 12 = 6  Right? " + (shapito.getArtists().get(1).getAlcoMetersPerWeek()==6));

        shapito.chargeSalary(100);

        Collections.sort(shapito.getArtists(),new ArtistAlcoCoparator());
       // shapito.printArtist();

        System.out.println("Zhora is an Alcoholic. We should fire him");

        shapito.getArtists().remove(0);

        shapito.printArtist();

    }
}
