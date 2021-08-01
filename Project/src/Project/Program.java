package Project;

public class Program {
    public static void main(String[] args) {
        Point point = new Point(5,5);

        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        Point point2 = new Point(2,2);

        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());

        System.out.println(point2.calcDistance(point));

    }
}
