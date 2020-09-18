import java.io.*;

class Demo {

	public static void main (String [] args) throws IOException {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter Input Range : ");	
	int num1 = Integer.parseInt(br.readLine());
	int num2 = Integer.parseInt(br.readLine());	
	
		for(int i = num1 ; i <= num2 ; i++  ) {
				int fact =1;
			for(int j =1 ; j<= i ; j++)  {
			
			fact = fact * j ; 
		//System.out.println("Factorial of "+num1+" is = "+fact);
			
			}
		System.out.println("Factorial of "+i+" is = "+fact);

		}
	}

}
