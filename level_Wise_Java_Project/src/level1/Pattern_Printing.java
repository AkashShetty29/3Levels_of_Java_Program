package level1;

import java.util.Scanner;

public class Pattern_Printing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows You want to print :");
		int row = sc.nextInt();
		
		int i, j; 
		
		for(i=1; i<=row; i++)   
		{    
			for(j=1; j<=i; j++)   
			{      
				System.out.print("#");   
			}   
			System.out.println();   
		} 

	}
}
