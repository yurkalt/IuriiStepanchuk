package week5.MyQueue;

import week4.dynamic.Node;

import java.util.Iterator;

import static week5.MyQueue.MyDeque.*;

/**
 * Created by Iurii on 18.02.2016.
 */
public class TestMyDeque {
    public static void main(String[] args) {

        MyDeque<String> deque = new MyDeque<String>(new Node<String>("first", new Node<String>("ds", null)));
        deque.addToQueue(newNodeStr());
        //deque.addToQueue(newNodeInt()); // adding Int to queue
        deque.print();
        System.out.printf("\nLets test Iterator:\n");
        Iterator iterator = deque.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Negative test;
        //int el = deque.getList().value;
    }
}
