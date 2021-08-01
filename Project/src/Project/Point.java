package Project;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = (int) ((Math.random() * (800 - 0)) + 0);
        setX(x);

        y = (int) ((Math.random() * (600 - 0)) + 0);
        setY(y);
    }

    public Point(double x, double y) {
        setX(checkValueX(x));
        setY(checkValueY(y));
    }

    private double checkValueX(double x) {
        if (x>800 || x<0) {
            x = (int) ((Math.random() * (800 - 0)) + 0);
            return x;
        }
        return x;
    }

    private double checkValueY(double y) {
        if (y>800 || y<0) {
            y = (int) ((Math.random() * (600 - 0)) + 0);
            return y;
        }
        return y;
    }

    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }
}
