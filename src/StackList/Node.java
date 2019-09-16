package StackList;

/**
 * Created by Jozhus on 9/5/2019.
 */
public class Node<T> {

    private Node<T> next;
    private T data;

    public Node() {
        this.next = null;
        this.data = null;
    }

    public Node(T data) {
        this.next = null;
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
