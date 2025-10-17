import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to store the values of the two sides of the triangle
        double a = 0;
        double b = 0;
        
        try {
            // Prompt the user to enter the value of side a
            System.out.print("Enter the value of side a: ");
            a = scanner.nextDouble();
            
            // Prompt the user to enter the value of side b
            System.out.print("Enter the value of side b: ");
            b = scanner.nextDouble();
            
            // Check if either side is negative
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("The sides of a triangle cannot be negative.");
            }
            
            // Calculate the value of the hypotenuse using the Pythagorean Theorem
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            
            // Output the result
            System.out.println("The value of the hypotenuse is: " + c);
        } catch (InputMismatchException e) {
            // Catch an InputMismatchException if the user enters a non-numeric value
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            // Catch an IllegalArgumentException if the user enters a negative value
            System.out.println(e.getMessage());
        }
    }
}
