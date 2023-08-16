package level1;

import java.util.Scanner;

public class Adding_two_nos_without_Plus_Operatot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number :");
		int n2 = sc.nextInt();
		
		for (int i = 1; i <= n2; i++)
		{
            n1++;
		}
         System.out.println("Sum is :" + n1);

	}

}
