package week2.library;

/**
 * Created by Iurii on 29.01.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library("NBU");
        library.addBook(new Book("Gaidamaky","Shevchenko",1842));
        library.addBook(new Book("Kavkaz","Shevchenko",1846));
        library.addBook(new Book("The Green mile","King",1996));
        library.addBook(new Book("The running man","King",1987));
        library.addBook(new Book("The Dead Era","Cruise",2009));

        System.out.println("5 books been added to library? " + (library.getCountBook()==5));

        library.addReader(new Reader("Andrii"));
        library.addReader(new Reader("Kate"));
        library.addReader(new Reader("John"));

        System.out.println("How many readers are in library? 3? " + (library.getCountReader()==3));

        library.getReaders(0).addBookToReader("Gaidamaky", library);
        System.out.println("Andrri has one book now? " + (library.getReaders(0).getCountBook()==1));

        System.out.println("Kate wants to take Gaidamaky book as well. Can library alow to do that?");
        library.getReaders(1).addBookToReader("Gaidamaky", library);

        System.out.println();
        library.getReaders(2).setInBlack(true);
        System.out.println("John wants to read King's book. Can library alow to do that?");
        library.getReaders(2).addBookToReader("The running man", library);



    }
}
