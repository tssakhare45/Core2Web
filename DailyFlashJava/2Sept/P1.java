import java.io.*;

class Demo {

	public static void main (String [] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Input Min and Max range");
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		System.out.println("Series of Even Numbers Ranging Between "+min+" and "+max+" is");
		for(int i = min ; i <= max ; i++)  {
	
			if(i % 2 == 0)
				System.out.print(i+ " ");

		}
		System.out.println();
	}	


}
