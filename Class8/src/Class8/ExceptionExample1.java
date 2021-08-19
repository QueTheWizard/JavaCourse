package Class8;

import java.util.*;

public class ExceptionExample1 {

    public static void main(String[] args) {
        boolean thereIsException = false;
        do {
            try {
                // TODO Auto-generated method stub
                Scanner in = new Scanner(System.in);

                System.out.println("Enter 1st number: ");
                int num1 = in.nextInt();

                System.out.println("Enter 2nd number: ");
                int num2 = in.nextInt();

                int div = num1 / num2;
                System.out.println("The division of the two numbers is: " + div);

                thereIsException = false;

            } catch (Exception e) {

                System.out.println("ERROR:" + e.getMessage() + ". Plesae enter the numbers again. ");
                thereIsException = true;

            }

        } while (thereIsException == true);
    }

}

