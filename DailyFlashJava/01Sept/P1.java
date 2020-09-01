import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Min and Max Range");
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		System.out.println("Odd numbers between "+min+" and "+max+" are :");
		for(int i = min ; i <= max ; i++) {
		
			if(i % 2 != 0)
				System.out.print(i+" ");

		}
		System.out.println();

	}	

}
