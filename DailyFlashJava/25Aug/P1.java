import java.io.*;

class Demo {

	public static void main (String ... args)throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Entered Number is  "+num);

	}


}
