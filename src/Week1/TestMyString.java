package Week1;

/**
 * Created by Iurii on 22.01.2016.
 */
public class TestMyString {

    public static void main(String[] args) {


        MyString name = new MyString(new char[]{'I', 'u', 'r', 'i', 'i', ' ', 'S', 't', 'e', 'p', 'a', 'n', 'c', 'h', 'u', 'k'});
        MyString city = new MyString(new char[]{'s', 'm', 'i', 'l', 'a'});


        name.print();

        MyString concat =  name.concat(city);
        concat.print();

        city.uppercase().print();
        city.uppercase().lowercase().print();

    }
}
