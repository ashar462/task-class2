import java.lang.Math;
import java.util.Scanner;

public class task11{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        double number = scanner.nextFloat();
        

        double num = Math.sqrt(number);
        double num1 = Math.cbrt(number);
       
        System.out.println("Square Root is " + num);
        System.out.println("Cube Root is " + num1);
        
        scanner.close();
    }
}