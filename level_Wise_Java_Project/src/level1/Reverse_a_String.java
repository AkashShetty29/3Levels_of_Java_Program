package level1;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		
		char d[]=s.toCharArray();
		
		System.out.println(d.length);
				
		for(int i=d.length;i>0;i--)
		{
			System.out.print(d[i-1]);
		}

	}

}
