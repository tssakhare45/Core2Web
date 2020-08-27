import java.io.*;
class Demo {
	public static void main (String [] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("Enter Two numbers:");
	int num = Integer.parseInt(br.readLine());	
	int num1 = Integer.parseInt(br.readLine());
	
	System.out.println("Addition is "+(num+num1));	
	System.out.println("Substraction is "+(num-num1));	

	}
}
