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

        // TODO getEvenStack

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
}
