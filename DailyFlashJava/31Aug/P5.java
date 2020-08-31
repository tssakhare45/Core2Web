import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in) ;
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter  Input");
		int num = Integer.parseInt(br.readLine());
		for(int i =1 ; i <= num ; i++) {
		
			if(num % i == 0) {	
			System.out.print(i+" ");
			}
		}
		System.out.println();

	}


}
