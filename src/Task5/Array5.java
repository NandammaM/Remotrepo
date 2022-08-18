package Task5;

public class Array5 {
	
	public static void main(String[] args) {
		
		int odd[] = {23,25,75,87,47,91,51,2};
		int even[] = {22,44,64,76,98,12,43,54,90};
		
		int l1 = odd.length;
		int l2 = even.length;
		
//		int temp[] =new int[l1];
//		int j=0;
		for (int j = 0; j < l2; j++) 
		{
		   if(even[j] % 2 != 0) {
			   System.out.println(even[j]);
		   }
		}
		
		for (int i = 0; i < l1; i++) {
			
			if(odd[i] % 2 == 0) {
				System.out.print(odd[i]);
			}
			
		}
		
		
	}

}
