import java.util.Scanner;

public class SwapTwoNumbers {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input first number
        System.out.println("Enter first number");
        int a=sc.nextInt();
        // Input second number
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        // Display swapped numbers
        System.out.println("After swapping : ");
        System.out.println("First number = "+a);
        System.out.println("Second number = "+b);
    }
}
