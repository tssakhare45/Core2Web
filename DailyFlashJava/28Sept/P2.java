import java.io.*;

class Demo {

	public static void main (String [] args) throws IOException  {

	InputStreamReader isr = new InputStreamReader(System.in); 
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter String 1 ");

	String first = br.readLine();

	System.out.println("Enter String 2 ");

	String Second = br.readLine();

	System.out.println(first+" "+Second);


	}

}
