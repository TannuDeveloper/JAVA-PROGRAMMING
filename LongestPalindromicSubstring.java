import java.util.Scanner;

public class LongestPalindromicSubstring {
        public String longestPalindrome(String s) {
        String longest ="";
         for(int i=0;i<s.length();i++)
         {
            for(int j=i;j<s.length();j++)
            {
                if(j-i+1>longest.length())
                {
                    int left =i;
                    int right=j;
                    boolean ispalin = true;
                    while(left < right)
                    {
                        if(s.charAt(left)!=s.charAt(right))
                        {
                            ispalin = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    if(ispalin)
                    {
                        longest = s.substring(i,j+1);
                    }
                }
            }
            
         }
        
          
    return longest;
    }    
   
    public static void main(String[] args) {
        LongestPalindromicSubstring obj =new LongestPalindromicSubstring();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String longest = obj.longestPalindrome(s);
        System.out.println("Longest Palindrome Substring = "+longest);
    }

}
