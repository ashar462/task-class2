import java.lang.Math;
import java.util.Scanner;

public class task9{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        float number = scanner.nextFloat();

        float num = Math.abs(number);
       
        System.out.println("Absolute is " + num);
        
        scanner.close();
    }
}