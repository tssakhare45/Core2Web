import java.io.*;

class Demo {
	
	public static void main (String [] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		long fact = 1L;
		System.out.println("Enter  number");	
		int num = Integer.parseInt(br.readLine());
		if(num <= 0)
			System.out.println("Error..!");
		else {
			for(int i =1 ; i <= num ; i++) {

				fact = fact * i;

			}
			System.out.println("Fact of "+num+" is "+fact);
		}

		}


}
