package week3;

import week2.univer.Address;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Iurii on 05.02.2016.
 */
public class Circus {
    private ArrayList<Artist> artists = new ArrayList<Artist>();
    private Address circusplase = new Address("Ukraine","Kiev","Peremogy",1);

    public void openTest(){
        artists.add(new Acrobat("Zhora"));
        artists.add(new Ropewalker("Ira"));
        artists.add(new Clown("Kolia"));
    }
    public void closeTest(){
        artists.removeAll(artists);
    }
    public void chargeSalary(int pay){
        for (int i = 0; i <artists.size() ; i++) {
            artists.get(i).setSalary(pay);
        }
    }

    public Address getCircusplase() {
        return circusplase;
    }

    public void setCircusplase(Address circusplase) {
        this.circusplase = circusplase;
    }

    public ArrayList<Artist> getArtists() {

        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    public void printArtist() {
        for (int i = 0; i < artists.size() ; i++) {
            System.out.println("Artist #" + (i+1));
            System.out.println(artists.get(i).toString());
        }
    }
}
