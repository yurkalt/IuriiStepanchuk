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
    }

    MyArray array1 = new MyArray(new int [7]);
}
