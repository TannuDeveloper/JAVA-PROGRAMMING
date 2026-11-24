import java.util.Scanner;

public class PalindromeNumber {
    
    int palindrome(int num)
    {
        int temp=num;
        int rem,reverse=0;
        while(temp>0)
        {
            rem = temp %10;
            reverse =reverse *10 +rem;
            temp =temp/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        PalindromeNumber obj=new PalindromeNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rev = obj.palindrome(num);
        if(num == rev)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
