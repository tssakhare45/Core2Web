import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException {
		int temp;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Numbers before Swapping "+num1+ " "+num2 );
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers After Swapping "+num1+ " "+num2 );
		
	}	

}
