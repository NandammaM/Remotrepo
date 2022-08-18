package Task4;

import java.util.Arrays;

public class Array11 
{
	static int [] sort(int[] a,int n) {
		
		int temp[] =  new int[n];
		
		int s=0;
		int l=n-1;
		boolean flag =true;
		
		for (int i = 0; i < n; i++) {
			
			if(flag) {
				temp[i] = a[l--];
				
			}
			else {
				temp[i] = a[s++];
			}
			flag = !flag;
			
		}
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{10,23,30,45,49,50,60,70,90,100,120};
		int result[];
		
		System.out.println("Original array");
		System.out.println(Arrays.toString(arr));
		
		result = sort(arr,arr.length);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(result));
	}

}
