package level3;

import java.util.Scanner;

public class Deleting_Specific_Element {

	public static void main(String[] args) {
		
		int i,n,del,position=0;
		int flag =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of element");
		n=sc.nextInt();
		
		int a[] = new int[n];
		int temp[] = new int[n-1];
		
		System.out.println("Enter the elements of an array");
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element you want to delete");
		del=sc.nextInt();
		
		for(i=0; i<n; i++)
		{
			if(a[i]==del)
			{
				position = i;
				flag = 1;
			}
		}
		
		if(flag==1) 
		{
			for(i=0; i<n-1; i++)
			{
				if(i<position)
				{
					 temp[i]=a[i];
				}
			
				if(i>=position)
				{
					temp[i] = a[i+1];
				}
			}
			
			System.out.println("Array after deletion : ");
			
			System.out.print("{ ");
			for(i=0; i<n-1; i++) 
			{
				System.out.print(temp[i] + ", " );
			}
			System.out.println("}");
		}
		
		else
		{
			System.out.println("Array element is not present");
		}

	}

}
