import java.io.*;
class Demo {
	public static void main (String [] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("Enter Two numbers:");
	int num = Integer.parseInt(br.readLine());	
	int num1 = Integer.parseInt(br.readLine());
	
	int cu = num * num * num;
	int cu1 = num1 * num1 * num1;

	int sq = num * num;
	int sq1 = num1 * num1;
	System.out.println("Addition of "+cu+ " and " +cu1 + "is "+(cu+cu1));	
	System.out.println("Substraction of "+sq+ " and " +sq1 + "is "+(sq-sq1));	

	}
}
