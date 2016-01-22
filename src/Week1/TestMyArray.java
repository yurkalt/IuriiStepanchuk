package Week1;

/**
 * Created by Iurii on 21.01.2016.
 */
public class TestMyArray {

    public static void main(String[] args) {

        MyArray array = new MyArray( new int[] {4,5,232,3,-1});

        // Minimal
        System.out.print("Smallest element of array ");
        array.print();
        System.out.println(array.min());

        //Maximum
        System.out.print("Biggest element of array ");
        array.print();
        System.out.println(array.max());

        // Random
        System.out.println("Random array :");
        MyArray randomArray = new MyArray(new int [5]);
        randomArray.random();
        randomArray.print();

        // Enlarge array
        System.out.println("Array enlarged on 4 elements :");
        MyArray enlarger = array.enlarge(4);
        enlarger.print();

        //Sort array:
        System.out.println("Sorted array:");
        MyArray sorted = array.sort();
        sorted.print();

        // Compare with random
        System.out.println("Compare array:");
        array.print();
        System.out.println("and random array:");
        randomArray.print();
        System.out.println("Result:");
        System.out.println(array.compare(randomArray));




    }
}
