package Sophie_HW_2;

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
            int[ ] temp = new int[data.length +5];
            temp = Arrays.copyOf(data, data.length +5);
            temp[data.length] = item;
            data = temp;
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

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return data[count -1];
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int length() {
        var content = Arrays.copyOfRange(data, 0, count);
        return content.length;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(data, 0, count);
        return Arrays.toString(content);
    }
}
