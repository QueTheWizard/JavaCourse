package Class8;

public class Driver {
    static void plot(double x0, double x1, double delta, Function f) {
        // plot f on values x0, x0+delta, ..., x1
        System.out.println("   Plot " + f.apply(x0));
    }


    public static void main(String[] argv) {
        System.out.println("Plot Sine:  ");
        plot(Math.PI / 2.0, 10.0, 0.1, new SineFunction());

        System.out.println("Empirical function:  ");
        plot(4.0, 10.0, 0.1, new EmpiricalFunction());
    }
}
