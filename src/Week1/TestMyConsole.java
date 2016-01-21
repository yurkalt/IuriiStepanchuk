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

        System.out.println("Введіть операцію (+,-,*,/):");
        String operScan = scan.next();

        System.out.println("Введіть друге число:");
        int numScan2 = scan.nextInt();
        MyConsole num2 = new MyConsole(numScan2);

        switch (operScan) {
            case "+":  MyConsole num3 = num1.add(num2);
                System.out.println("Результат:");
                System.out.println(num1.getValue() + " + " + num2.getValue() + " = " + num3.getValue());
                break;
            case "-":
                System.out.println("Результат:");
                MyConsole num4 = num1.rob(num2);
                System.out.println(num1.getValue() + " - " + num2.getValue() + " = " + num4.getValue());
                break;
            case "*":
                System.out.println("Результат:");
                MyConsole num5 = num1.mult(num2);
                System.out.println(num1.getValue() + " * " + num2.getValue() + " = " + num5.getValue());
                break;
            case "/":
                System.out.println("Результат:");
                System.out.println(num1.getValue() + " / " + num2.getValue() + " = " + num1.devide(num2));
                break;
        }

    }
}