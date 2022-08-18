package Task7;

import java.util.Scanner;

public class Char_count {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char ch[] = s.toCharArray();
		 int n = ch.length;
		 int count=1;
		 
		 for (int i = 0; i <= n-1; i++) 
		 {
			if(ch[i] ==' ') 
			{
				continue;
			}
			else {
			for (int j = i+1; j < n; j++) 
			{
			   if(ch[j] !=' ' &&  ch[i] == ch[j]  ) {
				   
				   count = count+1;
				   ch[j] =' ';
			   }
			   
			}
			
			}
			
			System.out.println(ch[i] +" "+ "character occured " +count +" "+ "times");
			count =1;
			
		}
	}
}
