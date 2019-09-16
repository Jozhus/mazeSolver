package StackList;

/**
 * Created by Jozhus on 9/5/2019.
 */
public interface StackADT<T> {
    public void push(T item);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}
