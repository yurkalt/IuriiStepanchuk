package week4.dynamic;

/**
 * Created by Iurii on 10.02.2016.
 */
public class TestNode {
    public static void main(String[] args) {

        Node test1 = NodeUtils.newChain();
        NodeUtils.printList(test1);
        System.out.println("Add to head!");
        Node result1 = NodeUtils.addToHead(new Node(23,null), test1);
        System.out.println("After :");
        NodeUtils.printList(result1);
        System.out.println();

        Node test2 = NodeUtils.newChain();
        System.out.println("Before :");
        NodeUtils.printList(test2);
        System.out.println("Add to tail!");
        NodeUtils.addToTail(new Node(100,null), test2);
        System.out.println("After :");
        NodeUtils.printList(test2);
        System.out.println();

        //To Array;
        Node test3 = NodeUtils.newChain();
        Node[] array = NodeUtils.toArray(test3);
        System.out.println("Second element of array is: " + array[2].toString());
        System.out.println("Length is 5 right ? " + array.length);
        System.out.println();

        // By Index!
        System.out.println("Inserting second element into list:");
        Node test4 = NodeUtils.newChain();
        NodeUtils.insertByIndex(2,new Node(12,null),test4);
        // Negative test:
       // NodeUtils.insertByIndex(10,new Node(12,null),head);
        NodeUtils.printList(test4);
        System.out.println();

        // Remove
        Node test5 = NodeUtils.newChain();
        System.out.println("Removing second element:");
        NodeUtils.remove(2,test5);
        //NodeUtils.remove(5,test5);
        NodeUtils.printList(test5);
        System.out.println();

        // IndexOF
        Node test6 = NodeUtils.newChain();
        System.out.println();
        NodeUtils.printList(test6);
        System.out.println("Index of element 4 is: ");
        System.out.println(NodeUtils.indexOf(4,test6));
        System.out.println();
        //Reverse
        System.out.println("Revers :");
        Node test7 = NodeUtils.newChain();
        NodeUtils.printList(NodeUtils.reverse(test7));




    }
}
