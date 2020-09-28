import java.io.*;

class Demo {

	public static void main (String [] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter numbers of rows ");
	
	int rows  = Integer.parseInt(br.readLine());

			for(int i = 1 ; i <= rows ; i++ ) {

		for(int j = 1 ; j<= rows ; j++) {

			if((i+j) % 2 == 0 )
				System.out.print("0 ");
			else
				System.out.print("1 ");
		}
			
			System.out.println();
		}


	}



}
