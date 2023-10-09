import java.lang.Math;
import java.util.Scanner;

public class task10{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Perpendicular: ");
        double number1 = scanner.nextFloat();
        System.out.print("Enter The Base: ");
        double number2 = scanner.nextFloat();

        double num = Math.sqrt(Math.pow(number1,2)+Math.pow(number2,2));
       
        System.out.println("Hypotenuse is " + num);
        
        scanner.close();
    }
}