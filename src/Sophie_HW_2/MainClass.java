package Sophie_HW_2;

import java.util.Arrays;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        var peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);


        // Stack1
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());

        for (int i = 0; i < 8; i++) {
            stack1.push(i);
        }

        System.out.println(stack1);
        stack1.push(40);
        System.out.println(stack1);

        // Reversed Stack and Stack1
        System.out.println(Arrays.toString(getReverseStack1(stack1)));
        System.out.println(getReverseStack(stack));

        // Max Stack
        Stack<Integer> stack2 = new Stack<Integer>();
        stack2.push(5);
        stack2.push(2);
        stack2.push(10);
        stack2.push(15);
        stack2.push(1);
        System.out.println(getMaxStack(stack2));

        // Max Stack1
        Stack1 stack3 = new Stack1();
        stack3.push(15);
        stack3.push(10);
        stack3.push(5);
        stack3.push(17);
        stack3.push(2);
        System.out.println(Arrays.toString(getMaxStack1(stack3)));

        // getEvenStack1
        Stack1 stack4 = new Stack1();
        stack4.push(15);
        stack4.push(4);
        stack4.push(12);
        stack4.push(13);
        stack4.push(8);
        System.out.println(Arrays.toString(getEvenStack1(stack4)));

        // getEvenStack
        Stack<Integer> stack5 = new Stack<Integer>();
        stack5.push(5);
        stack5.push(8);
        stack5.push(10);
        stack5.push(1);
        stack5.push(12);
        System.out.println(Arrays.toString(getEvenStack(stack5)));

    }

    public static int[] getReverseStack1(Stack1 stackArg) {
        int[] reverseArray = new int[stackArg.length()];

        for(int i=0; i<reverseArray.length; i++) {
            reverseArray[i] = stackArg.pop();
        }

        return reverseArray;
    }

    public static Stack<Integer> getReverseStack(Stack stackArg) {
        Stack<Integer> reverseStack = new Stack<>();

        int len = stackArg.size();
        for (int i = 0; i < len; i++) {
            reverseStack.push((Integer) stackArg.pop());
        }

        return reverseStack;
    }

    public static Stack<Integer> getMaxStack(Stack<Integer> stackArg) {
        Stack<Integer> tmpStack = new Stack<Integer>();

        while(!stackArg.isEmpty()) {
            int tmp = stackArg.pop();

            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                stackArg.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static int[] getMaxStack1(Stack1 stackArg) {
        int[] reverseArray = new int[stackArg.length()];

        for(int i=0; i<reverseArray.length; i++) {
            reverseArray[i] = stackArg.pop();
        }

        Arrays.sort(reverseArray);

        return reverseArray;
    }

    public static int[] getEvenStack1(Stack1 stackArg) {
        int[] arr = new int[stackArg.length()];
        int[] newArr = new int[stackArg.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = stackArg.pop();
        }

        for(int i = 0; i < arr.length;i++) {
            if (arr[i] % 2 == 0) {
                newArr[i] = arr[i];
            }
        }

        int n = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0)
                n++;
        }

        int[] newArrWithoutZero = new int[n];
        int j=0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0)
            {
                newArrWithoutZero[j]=newArr[i];
                j++;
            }
        }
        return newArrWithoutZero;
    }

    public static int[] getEvenStack(Stack<Integer> stackArg) {
        Stack<Integer> reverseStack = new Stack<>();

        int len = stackArg.size();
        for (int i = 0; i < len; i++) {
            reverseStack.push((Integer) stackArg.pop());
        }

        Object[] arrFromStack = reverseStack.toArray();
        int[] newArr = new int[arrFromStack.length];

        for(int i = 0; i < arrFromStack.length;i++) {
            if ((int) arrFromStack[i] % 2 == 0) {
                newArr[i] = (int) arrFromStack[i];
            }
        }

        int n = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0)
                n++;
        }

        int[] newArrWithoutZero = new int[n];
        int j=0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0)
            {
                newArrWithoutZero[j]=newArr[i];
                j++;
            }
        }
        return newArrWithoutZero;
    }
}
