import java.lang.Math;
import java.util.Scanner;

public class task12{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter Number 3: ");
        int number3 = scanner.nextInt();
        

        int num = Math.max((number3),Math.max(number1, number2));
        int num1 = Math.min((number3),Math.min(number1, number2));
       
        System.out.println("Max is " + num);
        System.out.println("Min is " + num1);
        
        scanner.close();
    }
}