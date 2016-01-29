package week2.library;

/**
 * Created by Iurii on 29.01.2016.
 */
public class Book {
    private String name;
    private String autor;
    private int year;
    private boolean available=true;

    public Book(String name, String autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {

        this.available = available;
    }

    public String getName() {

        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }
}
