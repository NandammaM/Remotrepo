package Task3;

import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int num_of_days_inmonth = 0;
		String monthName ="Unknown";
		
		System.out.println("Enter the month number : ");
		int month = sc.nextInt();
		
		System.out.println("Enter input Year:");
		int year=sc.nextInt();
		
		switch(month) {
		case 1:
			monthName = "January";
			num_of_days_inmonth = 31;
			break;
		case 2:
			monthName = "February";
			if((year % 400 == 0) || ((year % 4 ==0) ) && (year % 100 !=0)) {
				
				num_of_days_inmonth = 29;
			}
			else {
				num_of_days_inmonth =28;
			}
			break;
		case 3:
			monthName = "March";
			num_of_days_inmonth =31;
			
		case 4:
			monthName = "April";
			num_of_days_inmonth =30;
			
		case 5:
			monthName = "May";
			num_of_days_inmonth =31;
			
		case 6:
			monthName = "June";
			num_of_days_inmonth =30;
			
		case 7:
			monthName = "July";
			num_of_days_inmonth =31;
			
		case 8:
			monthName = "August";
			num_of_days_inmonth =31;
			
		case 9:
			monthName = "September";
			num_of_days_inmonth =30;
			
		case 10:
			monthName = "October";
			num_of_days_inmonth =31;
			
		case 11:
			monthName = "November";
			num_of_days_inmonth =30;
			
		case 12:
			monthName = "December";
			num_of_days_inmonth =31;
		}
		
		if(month > 0 && month < 13 )
		{
		  System.out.println(monthName+ " "+year+" "+ "has" +" "+num_of_days_inmonth+ "days\n");
		}
		else {
			System.out.println("Invalid details");
		}
	}

}
