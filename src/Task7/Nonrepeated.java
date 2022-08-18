package Task7;

public class Nonrepeated 
{
   public static void main(String[] args) {
	
	   String str="Hello world";
	   String s="";
	   int arr[] =new int[256];
	   
	   for (int i = 0; i < str.length(); i++) {
		  if(str.charAt(i)!=' ') {
			  arr[str.charAt(i)]++;
		  }
			
		}
	   char c=' ';
	   for (int i = 0; i < str.length(); i++) {
		if(arr[str.charAt(i)] ==1) {
			c=str.charAt(i);
			System.out.print(c);
		}
	}
		   

	}
	   
}

