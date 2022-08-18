package Task5;

import java.util.Iterator;

public class Arraysum2 {

	public static void main(String[] args) {
		
		int a[] = {10,20,3,21,40,5,6,7};
		int l=a.length;
		int temp;
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
		}
		
		for (int i = 1; i < a.length-1; i++) {
			
			sum = sum+a[i];
		}
		System.out.println(sum);
	} 
}
