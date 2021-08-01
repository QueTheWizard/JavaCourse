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

    public double calcDistance(Point other) {
        double x1 = other.getX();
        double x2 = this.getX();

        double y1 = other.getY();
        double y2 = this.getY();

        double x3 = x1 - x2;
        double y3 = y1 - y2;

        double distance = Math.sqrt(Math.pow(x3,2) + Math.pow(y3,2));

        return distance;
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
