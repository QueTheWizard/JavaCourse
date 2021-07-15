package Tirgul_3;

import java.util.Arrays;

public class Stack1 {
    private int[] data;
    private int top1;
    private int count;

    public Stack1() {
        top1 = -1;
        data = new int[10];
    }

    public void push(int item) {
        if (count == data.length) {
            throw new StackOverflowError();
        }
        data[count] = item;
        count++;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        count--;
        return data[count];
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
