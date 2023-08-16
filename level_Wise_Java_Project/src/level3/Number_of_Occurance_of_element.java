package level3;

import java.util.Scanner;

public class Number_of_Occurance_of_element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int n1 = sc.nextInt();
		
		int a[] = new int[n1];
		int b[] = new int[n1];
		
		
		System.out.println("Enter the elements of an array : ");
		
		for(int i=0; i<n1; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		
		int done = -1;
		for(int i=0; i<n1; i++)
		{
			int count = 1;
			for( int j=i+1; j<n1; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=done;
				}
			}
			
			 if(b[i] != done)
			 {
				 b[i] = count; 
			 }	
		}
		
		for(int i = 0; i < b.length; i++){  
            if(b[i] != done)  
                System.out.println(a[i] + " is printed " + b[i]+" times.");  
        }  
		

	}

}
