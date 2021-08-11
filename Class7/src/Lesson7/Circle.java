package Lesson7;

public class Circle extends AbstractClosedShape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);

        this.radius = radius;

        calcArea();
        calcCircumference();
    }

    public void calcArea() {
        area = Math.PI * radius * radius;
    }

    public void calcCircumference() {
        circumference = 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at x = " + x + " y = " + y + "Radius = " + radius + " Area = " + area);
    }
}
