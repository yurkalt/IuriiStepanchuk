package Week1;

/**
 * Created by Iurii on 19.01.2016.
 */
public class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public MyNumber add(MyNumber other){
        return new MyNumber(this.value + other.value);
    }

    public MyNumber rob(MyNumber other){
        return new MyNumber(this.value - other.value);
    }

    public MyNumber mult(MyNumber other){
        return new MyNumber(this.value * other.value);
    }

    public double devide(MyNumber other){
        double first = this.value;
        double second =  other.value;
        return first / second;
    }

    public MyNumber invol(MyNumber other){
        int res = 1;
        for (int i = 1; i <=other.value ; i++) {
            res *= this.value;
        }

        return new MyNumber(res);
    }

    public MyNumber fact(){
        int res=1;
        for (int i = 1; i <= this.value ; i++) {
            res *=i;
        }
        return new MyNumber(res);
    }

    public MyNumber mod(MyNumber other){
        return new MyNumber(this.value % other.value);
    }

    public void compare (MyNumber other){

        if (this.value > other.value) {
            System.out.println(this.value + " - найбільше число");
        }
        else {
            if (this.value < other.value){
                System.out.println(other.value + " - найбільше число");
            }
            else  {
                System.out.println("Обидва чистла мають однакові значення!");
            }
        }
    }

    public int getValue() {
        return value;
    }
}
