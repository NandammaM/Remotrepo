package Task3;

public class Operator5 {
	public static void main(String[] args) {
		long num =927465810392839l;
		int count =0;
		int sum=0;
		String s =String.valueOf(num);
		
		for (int i = 0; i <s.length(); i++) {
			int j =Character.digit(s.charAt(i), 20);
			sum=sum+j;
			count++;
		}
		System.out.println("Number of digits are:"+count);
		System.out.println("Sum of digits:"+" "+sum);
		
	}

}
