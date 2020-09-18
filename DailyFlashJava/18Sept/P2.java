import java.io.*;

class Demo {

	public static void main (String [] args) throws IOException {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter Input Range : ");	
	int num1 = Integer.parseInt(br.readLine());
	int num2 = Integer.parseInt(br.readLine());	
	
		for(int i = num1 ; i <= num2 ; i++  ) {

			if(num1 % 2 == 0){
				System.out.print((num1*num1)+ " ");
			num1++;
			}else {
				System.out.print((num1*num1*num1)+ " ");
			num1++;
			}


		}
		System.out.println();
	}

}
