package Task5;

public class Strings3 {
	
	public static void main(String[] args) {
		
		String s = "Consult add inc";
		
		String s1=" ";
		
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i) !=' ') {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
