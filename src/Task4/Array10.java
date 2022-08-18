package Task4;

import java.util.Arrays;

public class Array10 
{
   public int findsum(int a[]) {
	   Arrays.sort(a);
	   int i=0;
	   int j=a.length-1;
	   int positiveclose = Integer.MAX_VALUE;
	   int negativeclose = Integer.MIN_VALUE;
	   
	   while(i<j) {
		   int temp = a[i] + a[j];
		   
		   if(temp > 0) {
			   if(positiveclose > temp) {
				   positiveclose = temp;
			   }
			   j--;
		   }
		   else if(temp < 0) {
			   if(negativeclose < temp) {
				   negativeclose =temp;
			   }
			   i++;
		   }
		   else {
			   return 0;
		   }
	   }
	   
	   return Math.min(Math.abs(positiveclose), Math.abs(negativeclose));
   }
   public static void main(String[] args) {
	int a[] = {1,4,-53,-2,10,-6,20};
	int closestsum = new Array10().findsum(a);
	System.out.println("sum closest to zero is: " + closestsum);
}
}
