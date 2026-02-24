import java.util.Scanner;

public class javapractice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, height;
        
        // Taking user input
        System.out.print("Enter the base of the triangle in cm: ");
        base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextDouble();
        
        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;
        
        // Convert square centimeters to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 × 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        
        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);
        
        input.close();
    }
}

