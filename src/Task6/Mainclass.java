package Task6;

public class Mainclass {
	
	
		
		public static void main(String[] args) {
			Employee e1 = new Employee("Robert", 1994,  "64C- WallsStreet");
		    Employee e2 = new Employee("Sam", 2000,  "68d- WallsStreet");
		    Employee e3 = new Employee("John", 1999,  "26B- WallsStreet");
		    System.out.println("Name\tYear of joining\t\tAddress");
		    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());  
		    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress());  
		    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());
		}
	}



