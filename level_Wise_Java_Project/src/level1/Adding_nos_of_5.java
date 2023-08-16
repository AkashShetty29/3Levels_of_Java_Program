package level1;

public class Adding_nos_of_5 {

	public static void main(String[] args) {
		
		int sum=0, i;
		for(i=1; i<=100;i++)
		{
			if(i%5==0)
			{
				sum = sum+i;
			}
		}
		
		System.out.println("Total sum is : "+sum);

	}

}
