package level2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Findind_and_Counting_perticular_Character {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		
		System.out.println("Enter the Character you want to search :");
		char c = sc.next().charAt(0);
		
		int count = 0;
		
		char d[]= s.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			if(d[i]=='c'||d[i]=='C')
			{
				count++;
			}
		}
		System.out.println("The total no of occurance of "+c+" is "+count);

	}

}
