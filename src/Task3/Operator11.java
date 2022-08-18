package Task3;

import java.util.Scanner;

public class Operator11 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first decimal number");
		double x = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second decimal number");
		double y = sc1.nextDouble();
		//sc.close();
		
		if(Math.abs(x - y) <= 0.01)
		{
			System.out.println("they are same up to two decimal places");
		}
		else {
			System.out.println("numbers are different");
		}
	}

}
