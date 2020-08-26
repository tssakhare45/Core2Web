import java.io.*;

class Demo {

	public static void main (String ... args)throws IOException {
		int sum =0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		for(int i =1 ; i <= num ; i++ ) {
	
			sum = sum+i;
		}
		System.out.println("The sum upto "+num+ " is  "+sum);

	}


}
