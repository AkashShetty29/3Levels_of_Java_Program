package level3;

import java.util.Scanner;

public class Intersection_Of_Two_arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array : ");
		int n1 = sc.nextInt();
		
		int a[] = new int[n1];
		
		
		System.out.println("Enter the elements of first array : ");
		
		for(int i=0; i<n1; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the size of second array : ");
		int n2 = sc.nextInt();
		
		int b[] = new int[n2];
		int c[] = {};
		
		System.out.println("Enter the elements of second array : ");
		
		for(int i=0; i<n2; i++)
		{
			b[i] = sc.nextInt();
		}
		
		System.out.println("Intersection elemets are : ");
		for(int i=0; i<n1; i++)
		{
			for( int j=0; j<n2; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
				}
			}
		}
		
	}

}
