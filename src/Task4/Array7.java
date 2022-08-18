package Task4;

public class Array7 {
	
public static void main(String[] args) {
		
		int a[] = {6,3,22,4,5,7,8,9};
		int n = a.length;
		int temp;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = i+1; j < n; j++) {
				
				if(a[i] > a[j]) {
					
					temp =a[i];
					a[i] =a[j];
					a[j] =temp;
				}
				
			}
			
		}
		for (int j = 0; j < n; j++) {
			System.out.print(a[j]+" ");
			
		}
		System.out.println();
		//System.out.println("Second largest element is:" + a[n-2]);
		int res = a[n-1]-a[0];
		System.out.println("Difference between largest and smallest number is:" + " " + res);
}

}
