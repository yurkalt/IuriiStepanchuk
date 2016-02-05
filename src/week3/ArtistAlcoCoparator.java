package week3;

import java.util.Comparator;

/**
 * Created by Iurii on 05.02.2016.
 */
public class ArtistAlcoCoparator implements Comparator<Artist> {
    @Override
    public int compare(Artist o1, Artist o2) {
        return o1.alcoMetersPerWeek > o2.alcoMetersPerWeek ? -1:
               o1.alcoMetersPerWeek < o2.alcoMetersPerWeek ? 1 :
                       0 ;
    }
}
