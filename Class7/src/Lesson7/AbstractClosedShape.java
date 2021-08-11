package Lesson7;

public abstract class AbstractClosedShape extends AbstractShape {
    protected double area;
    protected double circumference;

    public AbstractClosedShape() {
        super();
    }

    public AbstractClosedShape(double x, double y) {
        super(x, y);
    }

    public abstract void calcArea();
    public abstract void calcCircumference();
}
