package week4.dynamic;

import javax.sound.sampled.ReverbType;
import java.util.ArrayList;

/**
 * Created by Iurii on 10.02.2016.
 */
public class NodeUtils<T> {

    public static Node newChain () {
        return new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,null)))));
    }

    public static<T> Node addToHead(Node<T> newNode, Node chainHead){
        newNode.next=chainHead;
        return newNode;
    }

    public static void addToTail(Node newNode, Node chainHead){
        if (chainHead.next == null) {
            chainHead.next = newNode;
        } else {
        addToTail(newNode, chainHead.next);
        }
    }

    public static String toString(Node chain){
        if (chain == null) {
            return "";
        } else {return chain.toString() + toString(chain.next); }

    }

    public static Node[] toArray(Node chain){
        int i=0;
        Node temp = chain;
        while (temp !=null) {
            temp=temp.next;
            i++;
        }
        Node nodes [] = new Node [i];
        for (int j = 0; j <i ; j++) {
            nodes[j]=chain;
            chain=chain.next;
        }
        return nodes;
    }

    public static Node insertByIndex(int index, Node newNode, Node chain){
        if (index==0) {
            addToHead(newNode,chain);
        }
        if (chain == null){
            System.err.println("Index is lower then list length!");
            return null;
        }
        if (index == 1 ) {
            newNode.next = chain.next;
            chain.next = newNode;
            return newNode;
        } else {return insertByIndex(index-1,newNode,chain.next);}
    }

    public static void printList (Node chain) {
        System.out.println(toString(chain));
    }

    public static Node remove(int index, Node chain){
        if (index==0) {
            chain = null;
            return chain.next;
        }
        if (chain.next == null){
            System.err.println("Index is lower then list length!");
            return null;
        }
        if (index == 1 ) {
            chain.next= chain.next.next;
            return chain;
        } else {return remove(index-1,chain.next);}
    }

    // use equals method
    public static int indexOf(Object target, Node chain){
        if (chain != null){
            if (chain.value.equals(target)) {
              return indexOf(target,chain.next);
            } else {
                return  indexOf(target, chain.next) + 1 ;
            }
        }
        return -1;
    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *
    public static Node reverse(Node chain){
       if (chain.next == null || chain == null) {
           return chain;
       }
        Node temp = chain.next;
        chain.next=null;
        Node result = reverse(temp);
        temp.next=chain;
        return result;
    }

    public static void removeLast (Node chain) {
        if (chain.next == null ) {
            chain=null;
        } else {
            removeLast(chain.next);
        }
    }

}
