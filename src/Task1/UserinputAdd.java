package Task1;

import java.util.Scanner;

public class UserinputAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		int z= num1+num2;
		System.out.println("The result is " + " "+z);
		
		int result=z+30;
		System.out.println("The final result is"+ " "+result);
	}

}
