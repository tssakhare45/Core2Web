import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter a number:");
	int num  = Integer.parseInt(br.readLine());
		
		for(int i =1 ; i <= 10 ; i++ ) {
		
			System.out.print(num*i+" ");
		}	
	System.out.println();
	}


}
