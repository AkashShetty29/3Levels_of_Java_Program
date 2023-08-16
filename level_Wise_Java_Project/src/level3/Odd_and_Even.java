package level3;

import java.util.Scanner;

public class Odd_and_Even {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Enter the number of element : ");
		int n = in1.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		System.out.println("Enter the elements of an array : ");
		for(int i=0; i<n; i++)
		{
			a[i]=in1.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			if(a[i]%2==0)
			{
				b[i]=a[i];
				System.out.println(" even number "+b[i]);
			}
			else
			{
				c[i]=a[i];
				System.out.println(" odd number "+c[i]);
			}
			
		}

	}

}
