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

    public MyScanner(String path) throws IOException {
        this.input = FileRead(path);
    }

    public String FileRead(String input) throws IOException {
        Reader reader = new FileReader(input);
        StringBuilder result = new StringBuilder();
        int val = -1;
        try {
            while ((val = reader.read()) != -1) {
                result.append((char) val);
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

    public static String nextString(String str) {
        int ind = str.indexOf(useDelemiter("space"));
        String res = str.substring(0, ind);

        if (str.substring(0, ind) instanceof String) {
            return res;
        } else {
            if (str.length() > 1) {
                nextString(str.substring(ind, str.length()));
            }
        }
        throw new NoSuchElementException();
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

        if (str.substring(0, ind) instanceof String) {
            return res;
        } else {
            if (str.length() > 1) {
                nextString(str.substring(ind, str.length()));
            }
        }
        throw new NoSuchElementException();


    }

    public String getInput() {
        return input;
    }

}
