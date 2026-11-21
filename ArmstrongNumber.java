import java.util.Scanner;
public class ArmstrongNumber{

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        // Input a number
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        int count =0;

        // count digit
        int temp = num;
        while(temp > 0)
        {
            count++;
            temp = temp /10;
        }

        // Calculate Armstrong number
        temp = num;
        while(temp > 0)
        {
            int remainder = temp % 10;
            sum = sum +(remainder * remainder * remainder);
            temp = temp/ 10;
        }

        // Check Armstrong number
        if(num == sum)
        {
            System.out.println( num +" is an Armstrong Number");
        }
        else
        {
            System.out.println(num +" is Not an Armstrong Number");
        }

    }
}