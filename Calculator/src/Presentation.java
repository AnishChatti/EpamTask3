import java.util.Scanner;


public class Presentation {
	
		public static void main(String args[]) {
		
			
			Scanner s=new Scanner(System.in);		
			System.out.print("Enter two numbers");
			double a=s.nextDouble();
			Data.seta(a);
			double b=s.nextDouble();
			Data.setb(b);
			System.out.println("Enter the operation(+,-,/,*)");
			char o=s.next().charAt(0);
				System.out.printf("Your outputs is:%f ",Business.result(o));
				s.close();
	}
}