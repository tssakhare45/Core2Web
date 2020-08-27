import java.io.*;
class Demo {

	public static void main(String [] args) throws IOException {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter Two numbers: ");
	int num1 = Integer.parseInt(br.readLine());	
	int num2 = Integer.parseInt(br.readLine());

	System.out.print("1.+\n2.-\n3.*\n4./ : ");
	System.out.println();
	System.out.println("Enter choice number");
	int choice = Integer.parseInt(br.readLine());
	
	switch (choice)	 {
			case 1 :
				  System.out.println("Addition is "+(num1+num2));
				  break;
			case 2 :
				  
				  System.out.println("Substraction is "+(num1-num2));
				  break;
			case 3 :
				  
				  System.out.println("Multiplication is "+(num1*num2));
				  break;
			case 4 :

				  System.out.println("Division is "+(num1/num2));
				  break;
	}


	}

}
