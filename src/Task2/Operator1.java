package Task2;

import java.util.Iterator;

public class Operator1 {
	public static void main(String[] args) {
		int n=5;
		int m=3;
		
		for (int i = 1; i <=20; i++) {
			
			if(i%n == 0 ) {
				System.out.println("Java Training");
			}
			
			if(i%m == 0) {
				System.out.println("Consultadd");
			}
			if(i%n == 0 && i%m == 0) {
				System.out.println("Consultadd Java Training");
			}
		}
	}

}
