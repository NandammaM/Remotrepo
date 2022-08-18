package Task6;

public class Complex_num_sum 
{
   int real;
   int image;
   
   Complex_num_sum(){
	   
   }
   public Complex_num_sum(int r, int i) 
   {
	   this.real= r;
	   this.image=i;
	 
   }
  
   public static Complex_num_sum add(Complex_num_sum n1, Complex_num_sum n2)
   {
	   Complex_num_sum res = new Complex_num_sum(0,0);
	   res.real = n1.real + n2.real;
	   
	   res.image = n1.image + n2.image;
	   
	   return res;
	   
   }
   
   public static Complex_num_sum subtraction(Complex_num_sum n1, Complex_num_sum n2)
   {
	   Complex_num_sum res = new Complex_num_sum(0,0);
	   res.real = n1.real - n2.real;
	   
	   res.image = n1.image - n2.image;
	   
	   return res;
	   
   }
   
   public static Complex_num_sum multi(Complex_num_sum n1, Complex_num_sum n2)
   {
	   Complex_num_sum res = new Complex_num_sum(0,0);
	   res.real = n1.real * n2.real;
	   
	   res.image = n1.image * n2.image;
	   
	   return res;
	   
   }
   void showC() {
	   System.out.println("Complex number :" +real+"+"+image+"i");
   }
   public static void main(String[] args) 
   {
	 
	   Complex_num_sum c1 = new Complex_num_sum(5,6);
	   Complex_num_sum c2 = new Complex_num_sum(7,8);
	   
	   Complex_num_sum c3 = new  Complex_num_sum();
	   
	   System.out.println("first complex number: ");
	   c1.showC();
	   
	   System.out.println("\nsecond complex number: ");
	   c2.showC();
	   
	    c3 = c3.add(c1,c2);
	   System.out.println("\n addition is: ");
	   c3.showC();
	   
	   c3 = c3.subtraction(c1,c2);
	   System.out.println("\n difference is: ");
	   c3.showC();
	   
	  c3 =c3.multi(c1,c2);
	   System.out.println("\n Multiplication  is: ");
	   c3.showC();
	   
	   
	   
	   
}
}
