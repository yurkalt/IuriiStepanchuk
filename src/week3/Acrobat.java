package week3;

import java.util.ArrayList;

/**
 * Created by Iurii on 05.02.2016.
 */
public class Acrobat extends Artist {


    public Acrobat(String name) {
        super(name);
    }

    public void act () {
        System.out.println("Performing a wheel!");
        actCount++;
    }

}
