import java.util.Scanner;

public class SwapTwoNumberWithOutExtraVriable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Take input from user
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();

        // Display numbers before swapping
        System.out.println("Before Swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // Swap numbers without extra variable
        a = b + a;
        b = a - b;
        a = a - b;

        // Display numbers after swapping 
        System.out.println("After Swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}