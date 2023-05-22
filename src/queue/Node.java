package queue;

public class Node<T> {
    private T value;
    private linkedlist.Node<T> next;
    private linkedlist.Node<T> prev;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public linkedlist.Node<T> getNext() {
        return next;
    }

    public void setNext(linkedlist.Node<T> next) {
        this.next = next;
    }

    public linkedlist.Node<T> getPrev() {
        return prev;
    }

    public void setPrev(linkedlist.Node<T> prev) {
        this.prev = prev;
    }
}

