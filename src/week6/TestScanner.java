package week6;

import java.io.IOException;

import static week6.MyScanner.*;

/**
 * Created by Iurii on 25.02.2016.
 */
public class TestScanner {

    public static void main(String[] args) throws IOException {

        MyScanner scaner1 = new MyScanner("Scanner.txt");
        System.out.println("First line of file:");
        System.out.println(nextLine(scaner1.getInput()));

        System.out.println();

        MyScanner scaner2 = new MyScanner("Scanner.txt");
        int res = nextInt(scaner2.getInput());
        System.out.println("First int in file:");
        System.out.println(res);
        System.out.println("Can we do something with int? can we multiply?  " + (res * 10 == 250) );

        System.out.println();

        System.out.println("First word: ");
        System.out.printf(nextString(new MyScanner("Scanner.txt").getInput()));

    }

}
