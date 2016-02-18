package week4.dynamic;


import static week4.dynamic.NodeUtils.*;

/**
 * Created by Iurii on 10.02.2016.
 */
public class TestNode {
    public static void main(String[] args) {

        Node test1 = newChain();
        printList(test1);
        System.out.println("Add to head!");
        Node result1 = addToHead(new Node(23,null), test1);
        System.out.println("After :");
        printList(result1);
        System.out.println();

        Node test2 = newChain();
        System.out.println("Before :");
        printList(test2);
        System.out.println("Add to tail!");
        addToTail(new Node(100,null), test2);
        System.out.println("After :");
        printList(test2);
        System.out.println();

        //To Array;
        Node test3 = newChain();
        Node[] array = toArray(test3);
        System.out.println("Second element of array is: " + array[2].toString());
        System.out.println("Length is 5 right ? " + (array.length==5));
        System.out.println();

        // By Index!
        System.out.println("Inserting second element into list:");
        Node test4 = newChain();
        insertByIndex(2,new Node(12,null),test4);
        // Negative test:
       // NodeUtils.insertByIndex(10,new Node(12,null),head);
        printList(test4);
        System.out.println();

        // Remove
        Node test5 = newChain();
        System.out.println("Removing second element:");
        remove(2,test5);
        //NodeUtils.remove(5,test5);
        printList(test5);
        System.out.println();

        // IndexOF
        Node test6 = newChain();
        System.out.println();
        printList(test6);
        System.out.println("Index of element 4 is: ");
        System.out.println(indexOf(4,test6));
        System.out.println();

        //Reverse
        System.out.println("Revers :");
        Node test7 = newChain();
        printList(reverse(test7));
    }
}
