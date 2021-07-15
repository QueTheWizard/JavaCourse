package Tirgul_3;

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
	}
}