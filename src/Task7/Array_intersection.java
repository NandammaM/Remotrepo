package Task7;

public class Array_intersection {

	
	public static void main(String args[]) {
	      int array1[] = {23, 36, 96, 78, 55};
	      int array2[] = {78, 45, 19, 73, 55};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<array1.length; i++ ) {
	         for(int j = 0; j<array2.length; j++) {
	            if(array1[i]==array2[j]) {
	               System.out.println(array2[j]);
	            }
	         }
	      }
	   }
}
