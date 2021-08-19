package Class8;


public class ExceptionExample2 {

    public static void main(String[] args) {

        try {
//            int a[] = new int[5];
//            a[5] = 30 / 0;

            String s = null;

            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("\nrest of the code");
    }
}

