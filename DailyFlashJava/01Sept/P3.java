import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException {
		int temp;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Input Range");
		int num = Integer.parseInt(br.readLine());
		
		for(int i =1 ; i <= num ; i++) {

			if(i%2 == 0)
				System.out.println("cube of "+i+ " is "+(i*i*i) );
		
		}
		
	}	

}
