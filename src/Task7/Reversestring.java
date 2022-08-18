package Task7;



public class Reversestring 

{
	public static void main(String[] args) 
	{
		 String s = "Consultadd";
		 char ch;
		 String temp =" ";
		 
		 for (int i = 0; i < s.length(); i++)
		 {
		   ch=s.charAt(i);
		   temp = ch+temp;
		   
		}
		 System.out.println("Reversed string is:" + temp);
		 
		 
	}
  
   
   
}
