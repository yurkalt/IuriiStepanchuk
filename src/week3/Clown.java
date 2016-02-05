package week3;

/**
 * Created by Iurii on 05.02.2016.
 */
public class Clown extends Artist {

    public Clown(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println(name + " is joking!!! Ha Ha!");
        actCount++;
    }
}
