package Task5;

import java.util.Scanner;

public class Strings6
{

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the input string");
//		String str = sc.next();
		
		String str = "Hello Welcome to java PROgraMMINg";
		StringBuffer sb =new StringBuffer(str);
		 
		 for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
			    sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));	
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				 sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
			
		}
		 System.out.print(sb);
	}
}
