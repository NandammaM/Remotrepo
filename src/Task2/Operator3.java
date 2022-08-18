package Task2;

public class Operator3 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int avg =(a+b+c)/3;
		System.out.println("Avg is "+avg);
		if(avg>a && avg>b && avg>c) {
			System.out.println("avg is heigher than a,b,c");
		}
		else {
			if(avg>a && avg>b) 
			{
				System.out.println("avg is higher than a,b,c");
		    }
			else {
				if(avg>a && avg>c)
				{
					System.out.println("avg is higher than a,c");
				}
				else {
					if(avg>b && avg>c) 
					{
						System.out.println("avg is just higher than b,c");
					}
					else {
						if(avg>a) {
							System.out.println("avg is just heigher than a");
						}
						else {
							if(avg>b) {
								System.out.println("avg is just heigher than b");
							}
							else {
								 if(avg>c) {
										System.out.println("avg is heigher than c");
									}
							}
						}
					}
				}
			}
			
			
		}
		
	}

}
