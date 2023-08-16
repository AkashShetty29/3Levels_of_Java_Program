package level4;

import java.util.Scanner;

public class Duplicate_element_in_String {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		String s = sc.nextLine();  
        int count;
        
        String s1=s.toLowerCase();
        
        char st[] = s1.toCharArray();  
          
        System.out.println("Duplicate characters in the string is : ");  
        
        for(int i = 0; i <st.length; i++) {  
            count = 1;  
            for(int j = i+1; j <st.length; j++) {  
                if(st[i] == st[j] && st[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    st[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && st[i] != '0')  
                System.out.println(st[i]);  
        }  

	}

}
