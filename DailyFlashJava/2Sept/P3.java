import java.io.*;

class Demo {

	public static void main (String [] args)throws IOException {
		int velocity;	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Input Distance(m) and Time(sec)");
		int Distance = Integer.parseInt(br.readLine());
		int Time = Integer.parseInt(br.readLine());
	
		velocity = Distance / Time ; 

		System.out.println("Velocity is "+velocity+" m/sec");
	}	


}
