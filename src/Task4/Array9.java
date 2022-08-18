package Task4;

public class Array9 
{
   public static void main(String[] args) {
	
	   int a[] = {1,2,4,5,6};
	   int n=a.length;
	   int res=0;
	   for (int i = 0; i < n-1; i++) {
		   for (int j = i+1; j < n-1; j++) 
		   {
			 res = a[i]+a[j] ;
			if(res == a[n-1]) {
				break;
				
			}
		}
		   break;
		  
	}
	   System.out.print(res);
	   
}
}
