package StackList;

/**
 * Created by Jozhus on 9/5/2019.
 */
public class StackList<T> implements StackADT<T> {

    private Node top;
    private int count;

    public StackList() {
        this.count = 0;
        this.top = null;
    }

    @Override
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.setNext(this.top);
        this.top = newNode;
        this.count++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }

        T popped = (T) this.top.getData();
        this.top = this.top.getNext();
        this.count--;

        return popped;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }

        return (T) this.top.getData();
    }

    @Override
    public boolean isEmpty() {
        return (this.count == 0);
    }

    @Override
    public int size() {
        return this.count;
    }

    public String toString() {
        String text = "";
        Node curr = this.top;

        for (curr = this.top; curr != null; curr = curr.getNext()) {
            text += (curr.getData()).toString();
            if (curr.getNext() != null) {
                text += "\n";
            }
        }

        return text;
    }
}
