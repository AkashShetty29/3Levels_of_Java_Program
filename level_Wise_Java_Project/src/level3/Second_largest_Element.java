package level3;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest_Element {

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
		
		Arrays.sort(a);
		
		int num=0;

			for(int i=n-1; i>0; i--)
			{
				if(a[i]!=a[i-1])
				{
					num = a[i-1];
					System.out.println("The second largest element : "+num);
					break;
				}
			}
			
	}

}
