package Lesson7;

public class NewRectangle extends AbstractClosedShape {
    private double height;
    private double width;

    public NewRectangle(double x, double y, double h, double w) {
        super(x, y);

        this.height = h;
        this.width = w;

        calcArea();
        calcCircumference();
    }

    @Override
    public void calcArea() {
        area = height * width;
    }

    @Override
    public void calcCircumference() {
        circumference = 2 * (height + width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle at x = " + x + " y = " + y + "height = " + height + "Width = " + width);
    }
}
