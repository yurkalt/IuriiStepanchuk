package week2.library;

/**
 * Created by Iurii on 29.01.2016.
 */
public class Reader {
    private String name;
    private Book [] booksreader = new Book [3];
    private boolean inBlack=false;
    private int countBook=0;

    public Reader(String name) {
        this.name = name;
    }

    public int getCountBook() {
        return countBook;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooksreader() {
        return booksreader;
    }

    public boolean isInBlack() {
        return inBlack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooksreader(Book[] books) {
        this.booksreader = books;
    }

    public void setInBlack(boolean inBlack) {
        this.inBlack = inBlack;
    }

    public void addBookToReader(String bookName,Library library) {
    if(inBlack) {
        System.out.println("This reader is in BLACK list. Get out!");
    }  else {
        for (int i = 0; i <library.getCountBook()  ; i++) {

            if (library.getBooks()[i].getName().equals(bookName)){
                if(library.getBooks()[i].isAvailable()){
                    booksreader[countBook]=library.getBooks()[i];
                    countBook++;
                    library.getBooks()[i].setAvailable(false);
                }   else {
                    System.out.println("Book isnt available!");
                }
            }

        }

    }

    }
}
