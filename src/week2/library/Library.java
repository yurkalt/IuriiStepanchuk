package week2.library;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Iurii on 29.01.2016.
 */
public class Library {
    private String name;
    private int countBook=0;
    private int countReader=0;
    private Book books [] = new Book [100];
    private Reader readers [] = new Reader [10];

    public Library(String name) {
        this.name  = name;
    }

    public void addBook(Book book) {
        if (books.length==countBook-1){
            books = Arrays.copyOf(books,books.length*2);
        }
        books[countBook]=book;
        countBook++;
    }

    public String getName() {
        return name;
    }

    public int getCountBook() {
        return countBook;
    }

    public int getCountReader() {
        return countReader;
    }

    public Book[] getBooks() {
        return books;
    }

    public Reader getReaders(int id) {
        return readers[id];
    }

    public void addReader(Reader body) {
        readers[countReader]=body;
        countReader++;
    }
}
