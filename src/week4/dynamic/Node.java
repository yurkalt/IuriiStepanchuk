package week4.dynamic;

/**
 * Created by Iurii on 10.02.2016.
 */
public class Node<T> {
    public T value;
    public Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return
                " value = " + value +"; ";
    }
}
