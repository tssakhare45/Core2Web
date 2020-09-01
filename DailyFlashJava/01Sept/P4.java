import java.io.*;

class Demo {
	public static void main(String [] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter numbers: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		if(num1 > num2)
			System.out.println(num1+" is greater betweeen "+num1+" and "+num2);
		else
			System.out.println(num2+" is greater betweeen "+num1+" and "+num2);
	}


}
