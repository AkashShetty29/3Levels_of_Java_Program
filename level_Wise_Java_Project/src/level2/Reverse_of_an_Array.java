package level2;

import java.util.Scanner;

public class Reverse_of_an_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements of an array : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();		
		}
		
		System.out.println("array Before : ");
		for(int i=0; i<n; i++)
		{
			System.out.println(a[i]);		
		}
		
		System.out.println("array After : ");
		for(int i=n-1; i>=0; i--)
		{
			System.out.println(a[i]);		
		}
		

	}

}
