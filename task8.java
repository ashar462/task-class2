import java.lang.Math;
import java.util.Scanner;

public class task8{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Radius: ");
        double number = scanner.nextDouble();

        double num = (Math.pow(number,2));
        double area = (Math.PI)*num;

        double cir = 2*Math.PI*number;



        System.out.println("Area of circle is " + area);
        System.out.println("Circumference of circle is " + cir);
        
        scanner.close();
    }
}