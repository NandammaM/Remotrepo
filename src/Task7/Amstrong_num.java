package Task7;

public class Amstrong_num {
	
	public static void main(String[] args) {
		
		int n=370;
		int temp =n;
		int a;
		int c=0;
		
		while(n > 0) {
			a = temp % 10;
			c = c + a*a*a;
			temp = temp/10;
		}
		System.out.println(c);
		if(n == c) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not an amstrong number");
		}
		
	}

}
