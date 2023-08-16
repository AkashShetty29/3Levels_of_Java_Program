package level3;

import java.util.Scanner;

public class Reverse_an_array {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the total no of elements...");
		n= sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
	
		int k,j,c;
		
		k=n;
		
		while(k>=0)
		{
			
			for(j=0;j<k-1;j++)
			{
				c =a[j];
				a[j]= a[j+1];
				a[j+1]=c;
			}
			
			k--;			
		}	
		
		System.out.println("reverse of an array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
