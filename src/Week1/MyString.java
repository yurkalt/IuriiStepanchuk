package Week1;

/**
 * Created by Iurii on 22.01.2016.
 */
public class MyString {
    private char [] string;

    public MyString(char [] string) {
        this.string = string;
    }

    public void print () {
        System.out.print("{");
        for (int i = 0; i < this.string.length ; i++) {
            System.out.print(this.string[i]);
        }
        System.out.println("}");
    }

    public MyString uppercase () {

        MyString result = new MyString(new char [this.string.length]);
        for (int i = 0; i < this.string.length ; i++) {
            result.string[i] = this.string[i];
            result.string[i] -= 32;

        }
        return result;
    }

    public MyString lowercase () {

        MyString result = new MyString(new char [this.string.length]);
        for (int i = 0; i < this.string.length ; i++) {
            result.string[i] = this.string[i];
            result.string[i] += 32;

        }
        return result;
    }

    public MyString concat (MyString other) {
        MyString result = new MyString(new char [this.string.length + other.string.length]);
        for (int i = 0; i <this.string.length  ; i++) {
            result.string[i] = this.string[i];
        }
        for (int i = this.string.length; i <result.string.length ; i++) {
            result.string[i] = other.string[i-this.string.length];
        }
        return result;
    }

    public char[] getString() {
        return string;
    }

    public void setString(char[] string) {
        this.string = string;
    }
}
