package Task7;

import java.util.Scanner;

public class Word_count {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int n=str.length();
		int count = 1;
		String s=" ";
		
		for (int i = 0; i < n-1; i++) {
			if(ch[i] !=' ') {
				s = s+ch[i];
			}
			else {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
