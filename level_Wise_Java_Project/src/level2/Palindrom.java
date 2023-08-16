package level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {
	
	 public static boolean isPalindrome(String str)
	    {
	        String rev = "";
	 
	        boolean ans = false;
	 
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
	 
	        if (str.equals(rev)) {
	            ans = true;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to search :");
		String str = sc.nextLine();

        str = str.toLowerCase();
        boolean A = isPalindrome(str);

		if(A) {
			System.out.println(str+" is Palindrom");
		}
		
		else
		{
			System.out.println(str+" is Not Palindrom");
		}
	}

}
