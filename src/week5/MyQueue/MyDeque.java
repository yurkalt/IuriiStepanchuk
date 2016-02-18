package week5.MyQueue;
import week4.dynamic.Node;
import java.util.Iterator;
import static week4.dynamic.NodeUtils.*;

/**
 * Created by Iurii on 17.02.2016.
 */
public class MyDeque<T> {

    private Node<T> list;

    public static Node<Integer> newNodeInt() {
        int res = (int) (Math.random() * 1000);
        return new Node<Integer>(res, null);
    }

    public static Node<String> newNodeStr() {
        double value = Math.random()*1000;
        return new Node<String>(Double.toString(value),null);
    }

    public MyDeque(Node<T> list) {
        this.list = list;
    }

    public void addToQueue(Node<T> node) {
        this.list = addToHead(node, this.list);
    }
    public void removeFromQueue(){
        removeLast(this.list);
    }

    public void print () {
        printList(this.list);
    }

    public Node<T> getList() {
        return list;
    }

    public Iterator createIterator(){
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator {
        Node<T> curr = list;
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public Node<T> next() {
            Node<T> res = curr;
            curr=curr.next;
            return res;
        }
    }
}
