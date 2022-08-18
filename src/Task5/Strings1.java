package Task5;

public class Strings1
{
  public static void main(String[] args) {
	String str = "Hello everyone welcome to java progamming";
	String word="", small="";
	String[] words = new String[100];
	int len=0;
	
	str = str+" ";
    for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)!=' ') {
			word = word+str.charAt(i);
		}
		else {
			words[len] =word;
			len++;
			word ="";
		}
	}	
    small = words[0];
    
    for (int j = 0; j < len; j++) {
    	if(small.length()>words[j].length()) {
    		small=words[j];
    	}
		
	}
    System.out.println("Smallest word is:" + small);
}
}
