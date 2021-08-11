package Project;

import java.util.Random;

public class Point {
    private final int MAX_X = 800;
    private final int MAX_Y = 600;
    private final int MIN_VAL = 0;

    private double x;
    private double y;

    public Point() {
        Random r = new Random();

        x = r.nextInt(MAX_X) - r.nextDouble();
        y = r.nextInt(MAX_Y) - r.nextDouble();

        System.out.println("Creating " + this);
    }

    public Point(double x, double y) {
        this.x = checkValue(x, MIN_VAL, MAX_X);
        this.y = checkValue(y, MIN_VAL, MAX_Y);

        if (this.x != x) {
            System.out.println(x + " is illegal value for x and has been replaced with " + this.x);
        }

        if (this.y != y) {
            System.out.println(y + " is illegal value for y and has been replaced with " + this.y);
        }

        System.out.println("Creating " + this);
    }

    private double checkValue(double num, int min, int max) {
        Random r = new Random();

        if (num < min || num > max) {
            num = r.nextInt(max - min + 1) + min - r.nextDouble();
        }

        return num;
    }

    public double calcDistance(Point other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}
