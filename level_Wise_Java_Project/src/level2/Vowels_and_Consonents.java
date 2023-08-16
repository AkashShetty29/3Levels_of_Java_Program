package level2;

import java.util.Scanner;

public class Vowels_and_Consonents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Content :");
		String s = sc.nextLine();
		
		String s1 = s.toUpperCase();
		
		int v=0;
		int c=0;
		
		char s2[] = s1.toCharArray();
		
		for(int i=0; i<s2.length; i++)
		{
			if(s2[i]=='A' || s2[i]=='E' || s2[i]=='I' || s2[i]=='O' || s2[i]=='U')
			{
				v++;
			}
			
			else if( s2[i]==' ')
			{
				continue;
			}
			
			else
			{
				c++;
			}
		}
		
		System.out.println("Total number of VOWELS : "+v);
		System.out.println("Total number of CONSONENTS : "+c);
		

	}

}
