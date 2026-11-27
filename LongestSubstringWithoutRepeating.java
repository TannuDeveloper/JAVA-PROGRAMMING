import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

   public int lengthOfLongestSubstring(String s) {
       int max =0;
      int left =0;
    //   Array to store the next valid index (index + 1) for all 128 ASCII Characters
      int [] lastIndex = new int [128];
       for(int right = 0;right <s.length();right++)
       {
        char ch = s.charAt(right);

        // If the character was seen before, jump the left pointer forword
        // Math.max ensures the left pointer never moves backward
        left = Math.max(left,lastIndex[ch]);
        // Calculate the current window size and update max
        max = Math.max(max,right - left +1);
        //  Store the next safe position (current index + 1) for this character
        lastIndex[ch]=right + 1;
       }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating obj=new LongestSubstringWithoutRepeating();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string");
       String s=sc.nextLine();
        int max= obj.lengthOfLongestSubstring(s);
        System.out.println(max);
    }
}