package week6;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created by Iurii on 25.02.2016.
 */
public class MyScanner {

    private final String input;
    private int start = 0;
    private int end = 0;

    public MyScanner(String path) throws IOException {
        this.input = FileRead(path);
    }

    public String FileRead(String input) throws IOException {
        Reader reader = new FileReader(input);
        StringBuilder result = new StringBuilder();
        char[] buff = new char[1000];
        int val = -1;
        try {
            while ((val = reader.read(buff)) != -1) {
                result.append(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return result.toString();
    }

    private static String useDelemiter(String option) {
        switch (option) {
            case "line":
                return System.getProperty("line.separator");
            case "space":
                return " ";
        }
        return null;
    }

    public static boolean hasNext(MyScanner scan) {
        if (scan.start == scan.input.length()) {
            return false;
        }
        return true;
    }

    public static String nextString(MyScanner scan) {
        String delimSpace = useDelemiter("space");
        String delimLine = useDelemiter("line");
        while (delimSpace.equals(String.valueOf(scan.input.charAt(scan.start)))) {
            scan.start++;
        }
        if (delimLine.equals(String.valueOf(scan.input.charAt(scan.start)))) {
            scan.start++;
        }
        String temp = scan.input.substring(scan.start, scan.input.length());
        int temStart = scan.start;
        if (temp.indexOf(delimLine) < temp.indexOf(delimSpace)) {
            scan.end = temp.indexOf(delimLine) + temStart;
            scan.start = scan.end + 1;
            return scan.input.substring(temStart, scan.end);
        } else {
            scan.end = temp.indexOf(delimSpace) + temStart;
            scan.start = scan.end;
            return scan.input.substring(temStart, scan.end);
        }
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static int nextInt(String str) {
        int ind = str.indexOf(useDelemiter("space"));
        String res = str.substring(0, ind);

        if (isInt(res)) {
            Integer out = Integer.parseInt(res);
            return out.intValue();
        } else {
            if (str.length() > 1) {
                return nextInt(str.substring(ind + 1, str.length()));
            }
        }
        throw new InputMismatchException();
    }

    public static String nextLine(String str) {
        int ind = str.indexOf(useDelemiter("line"));
        String res = str.substring(0, ind);
        if (str.length() > 0) {
            return res;
        } else {
            return null;
        }
    }

    public String getInput() {
        return input;
    }

}
