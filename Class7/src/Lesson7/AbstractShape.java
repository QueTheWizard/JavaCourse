package Lesson7;

public abstract class AbstractShape {
    protected double x;
    protected double y;

    public AbstractShape() {
        super();
    }

    public AbstractShape(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
