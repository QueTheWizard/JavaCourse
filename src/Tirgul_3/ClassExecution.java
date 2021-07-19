package Tirgul_3;

import java.util.Stack;

public class ClassExecution {
	public static void main(String[] args) {
		Circle c, maagal;

		c = new Circle(10, 8, 102);

		float area = c.calcArea();
		System.out.println("Area of circle C is " + area);

		float cir = c.calcCircum();
		System.out.println("The circumference of circle  C is " + cir);

		System.out.println("\n\n");

		maagal = new Circle(c);

		c.setRadius(22);

		area = c.calcArea();
		System.out.println("Area of circle C is " + area);

		cir = c.calcCircum();
		System.out.println("The circumference of circle  C is " + cir);

		System.out.println("\n\n");


		area = maagal.calcArea();
		System.out.println("Area of circle Maagal is " + area);

		cir = maagal.calcCircum();
		System.out.println("The circumference of circle maagal is " + cir);

		System.out.println("\n\n");

/*		
		Rectangle r1;
		r1 = new Rectangle();
		
		r1.setLength(20);
		r1.setWidth(12);
		
		area = r1.calcArea();
		System.out.println("Area of a First rectangle is " + area);

		cir = r1.calcCircum();
		Syste
*/
		// Stacks
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

		// Reverse a string
		String str = "abcd";
		StringReverser reverser = new StringReverser();

		var result = reverser.reverse(str);

		System.out.println(result);

		Stack1 stack1 = new Stack1();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		System.out.println(stack1.peek());
		System.out.println(stack1.isEmpty());

		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		stack1.push(30);
		System.out.println(stack1);
		stack1.push(40);
		System.out.println(stack1);
	}
}