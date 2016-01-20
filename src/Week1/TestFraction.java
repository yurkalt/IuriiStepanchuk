package Week1;

/**
 * Created by Iurii on 20.01.2016.
 */
public class TestFraction {

    public static void main(String[] args) {
        // Creating 2 fraction numbers
        Fraction drib1 = new Fraction (10,6);

        Fraction drib2 = new Fraction (8,2);

        // Sum of 1 and 2 numbers

        Fraction drib3 = drib1.sum(drib2);
        System.out.println("Sum:");
        drib3.print(drib1,"+",drib2);

        //drib1 - drib2 = drib4

        Fraction drib4 = drib1.rob(drib2);
        System.out.println("Rob: ");
        drib4.print(drib1,"-",drib2);

        //drib1 * drib2 = drib5

        Fraction drib5 = drib1.mult(drib2);
        System.out.println("Multiply :" );
        drib5.print(drib1,"*",drib2);

        //drib1 - drib2 = drib6

        Fraction drib6 = drib1.div(drib2);
        System.out.println("Dividing :" );
        drib6.print(drib1,":",drib2);




    }
}
