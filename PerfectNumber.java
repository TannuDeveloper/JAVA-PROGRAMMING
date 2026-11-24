import java.util.Scanner;

public class PerfectNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        // Take input from the user
        System.out.println("Entera number");
        int num = sc.nextInt();
        int sum=0;
        //find the factors of the number
        for(int i=1;i<=num/2;i++)
        {
            // Check whether i is a factor of num
            if(num % i== 0)
            {
                // Add the factor to sum
                sum = sum + i;
            }
        }
        // Check whether the sum is equal to the number
        if(num > 0 && sum == num)
        {
            System.out.println(num +" is a Perfect Number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }

    } 
}
