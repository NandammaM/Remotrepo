package Task5;

public class ReverseString
{
 
	public static void main(String[] args) {
		String str = "Har Ghar Tiranga";
		String rev ="";
		
		char s[] = str.toCharArray();
		
		for (int i =s.length-1;i>=0; i--) {
			rev =rev+s[i];
			
		}
		System.out.println(rev);
	}
}
