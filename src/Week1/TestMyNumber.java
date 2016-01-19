package Week1;

/**
 * Created by Iurii on 19.01.2016.
 */
public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber num1 = new MyNumber(15);
        MyNumber num2 = new MyNumber(9);

        //Sum
        MyNumber num3 = num1.add(num2);
        System.out.println(num1.getValue()  + " + " + num2.getValue() + " = " + num3.getValue());

        //Minus
        MyNumber num4 = num1.rob(num2);
        System.out.println(num1.getValue()  + " - " + num2.getValue() + " = " + num4.getValue());

        //Mult
        MyNumber num5 = num1.mult(num2);
        System.out.printf(num1.getValue()  + " * " + num2.getValue() + " = " + num5.getValue());

        //Devid

        System.out.println(num1.getValue()  + " / " + num2.getValue() + " = " + num1.devide(num2));

        //Invol
        MyNumber num7 = num1.invol(num2);
        System.out.println(num1.getValue()  + " в степіні " + num2.getValue() + " = " + num7.getValue());

        //Fact
        MyNumber num8 = num1.fact();
        System.out.println("Факторіал " + num1.getValue()  + " = " + num8.getValue());

        // Mod
        MyNumber num9 = num1.mod(num2);
        System.out.println(num1.getValue()  + " mod " + num2.getValue() + " = " + num9.getValue());

        //Compare
        num1.compare(num2);





        int i = 33;
        //
        // myNumber + myNumer = myNumber
        // myNum + 4 = double

    }

}
