package level3;

import java.util.Scanner;

public class Finding_Duplicate_Element_in_Array {

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
		
//		Arrays.sort(a);
//		
//		for(int i=0; i<n; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		int temp=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
//			System.out.println(a[i]);
		}
		
		System.out.println("The repeated elemets are : ");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}		
	}

}
