import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in) ;
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Range Input");
		int num = Integer.parseInt(br.readLine());
		for(int i =1 ; i <= num ; i++) {
		
			if(i % 2 != 0) {	
			System.out.println("Cube of "+i+" is "+(i*i*i));
			System.out.println("Square of "+i+" is "+(i*i));
			}
		}
		System.out.println();

	}


}
