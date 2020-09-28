import java.util.*;

class Demo {

	public static void main (String [] args)  {

	Scanner sc = new Scanner(System.in);

		System.out.println("Enter String ID");
		
		String st = sc.next();

		System.out.println("Enter Numerical ID");

		int num = sc.nextInt();
		System.out.println("Your Mail-ID is ");
		System.out.println(st+num+"@gmail.com");


	}


}
