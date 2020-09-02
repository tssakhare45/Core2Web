import java.io.*;

class Demo {

	public static void main (String [] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Numbers:");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		if(num1 > num2 && num1 > num3)
			System.out.println("The max Between number "+num1+" "+num2+" and "+num3+" is "+num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("The max Between number "+num1+" "+num2+" and "+num3+" is "+num2);
		else
			System.out.println("The max Between number "+num1+" "+num2+" and "+num3+" is "+num3);
	}	


}
