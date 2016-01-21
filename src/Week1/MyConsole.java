package Week1;

/**
 * Created by Iurii on 21.01.2016.
 */
public class MyConsole {

    private int value;

    public MyConsole(int value) {

        this.value = value;
    }

    public MyConsole add(MyConsole other){
        return new MyConsole(this.value + other.value);
    }

    public MyConsole rob(MyConsole other){
        return new MyConsole(this.value - other.value);
    }

    public MyConsole mult(MyConsole other) {
        return new MyConsole(this.value * other.value);
    }

    public double devide(MyConsole other){
        double first = this.value;
        double second =  other.value;
        return first / second;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
