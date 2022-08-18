package Task7;

public class Max_value 
{
    public static void main(String[] args) {
		int a [] = {20,33,29,49,58,71,99};
		int n = a.length;
		int temp;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] > a[i+1]) {
				temp = a[i];
				a[i] =a[i+1];
				a[i+1] =temp;
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Maximum value of the array is: " +" "+a[n-1]);
	}
}
