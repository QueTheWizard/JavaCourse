package Tirgul10;

public class Node<T extends Number & Runnable> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}
