import java.util.Scanner;

public class javapractice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double number1, number2;
        
        // Taking user input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        
        // Performing operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Printing results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division);
        
        input.close();
    }
}
