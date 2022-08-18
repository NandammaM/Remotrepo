package Task5;

import java.util.Scanner;

public class Strings4 {
	
	static boolean is_isogram(String str) {
        str = str.toLowerCase();
		
		char [] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				
				return false;
			}
			
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		
		System.out.println(is_isogram(str));
		
		
	}

}
