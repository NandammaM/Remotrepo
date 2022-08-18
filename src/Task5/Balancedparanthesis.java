package Task5;

import java.util.Scanner;
import java.util.Stack;

public class Balancedparanthesis 
{
     public static boolean balpar(String str) {
    	 
    	 Stack sk= new Stack();
    	 
    	 char [] charArray = str.toCharArray();
    	 
    	 for (int i = 0; i < charArray.length; i++) 
    	 {
		   char current = charArray[i];
		   if(current =='{' || current == '['||  current =='(') {
			   sk.push(current);
			   continue;
		   }
		   if(sk.isEmpty()) {
			   return false;
		   }
		   char popChar;
		   
		   switch(current) {
		   
		   case ')':
			   popChar = (char) sk.pop();
		   if(popChar == '{' || popChar == '[') {
			   return false;
		   }
		   break;
		   
		   case '}':
			   popChar = (char) sk.pop();
		   if(popChar == '(' || popChar == '[') {
			   return false;
		   }
		   break;
		   
		   case ']':
			   popChar = (char) sk.pop();
		   if(popChar =='(' || popChar == '{') {
			   return false;
		   }
		   break;
		   
		   }
		}
		return (sk.isEmpty());
    	 
     }
     
     public static void main(String[] args) {
		
    	 String str;
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter input string");
    	 
    	 str = sc.nextLine();
    	 
    	 if(balpar(str)) {
    		 System.out.println("String has balanced braces");
    	 }
    	 else {
    		 System.out.println("String has unbalanced braces");
    	 }
	}

}
