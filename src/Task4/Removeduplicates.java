package Task4;

public class Removeduplicates 
{
	
	 public static int removedpl(int arr[],int n)
	   {
		   if(n==0 || n==1) {
			   return n;
		   }
		   int a[] =new int[n];
		   int k =0;
		   for (int i = 0; i < n-1; i++) {
			   if(arr[i] != arr[i+1]) {
				   a[k++] =arr[i];
			   }
			
		}
		   a[k++] =arr[n-1];
		   for (int i = 0; i < k; i++)
		   {
			arr[i] =a[k];
		}
		   return k;
	   	
	   
	   }
   public static void main(String[] args) 
   {
	   int arr[] = {2,3,1,4,5,6,8,3,2};
	   int n= arr.length;
	   n = removedpl(arr, n);
	  
	   int temp;
	   
	   for (int i = 0; i < n-1; i++) 
	   {
          for (int j = i+1; j < n-1; j++)
          {
			 if(arr[i] > arr[j])
			 {
				 temp = arr[i];
				 arr[i] =arr[j];
				 arr[j] = temp;
				 
			 }
		  }		
          
    	}
	   
   }
  
}


