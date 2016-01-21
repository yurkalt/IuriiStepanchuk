package Week1;

import java.util.Scanner;


/**
 * Created by Iurii on 21.01.2016.
 */
public class TestMyConsole {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);






        System.out.println("Введіть перше число:");
        int numScan1 = scan.nextInt();
        MyConsole num1 = new MyConsole(numScan1);

        System.out.println("Введіть друге число:");
        int numScan2 = scan.nextInt();
        MyConsole num2 = new MyConsole(numScan2);

        //Sum
        MyConsole num3 = num1.add(num2);
        System.out.println(num1.getValue() + " + " + num2.getValue() + " = " + num3.getValue());

        //Minus
        MyConsole num4 = num1.rob(num2);
        System.out.println(num1.getValue() + " - " + num2.getValue() + " = " + num4.getValue());

    }
}