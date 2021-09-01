package Tirgul10;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue<T> {
    private Node head;
    private Node last; // tail
    private int count;

    class Node<S> {
        private S data;
        private Node next;

        public Node(S data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedListQueue() {
        head = last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void enqueue(T el) {
        Node<T> n = new Node<T>(el);
        if (isEmpty()) {
            head = n;
        } else {
            last.next = n;
        }
        last = n;
        count++;
    }

    public String toString() {
        String s = "[ ";
        Node<T> temp = head;

        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }
        s += "]";
        return s;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T temp = (T)head.data;
            head = head.next;
            if (isEmpty()) {
                last = null;
            }
            count--;
            return temp;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> list = new LinkedListQueue<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.enqueue(i);
            System.out.println(list + "," + list.size());
        }

        for (int i = 1; i <= 10; i++) {
            list.dequeue();
            System.out.println(list + "," + list.size());
        }

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
            System.out.println(q);
        }

        for (int i = 1; i <= 10; i++) {
            q.remove();
            System.out.println(q);
        }
    }

}
