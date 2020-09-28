import java.io.*;
class Demo {

	public static void main (String [] args) throws IOException{
		
	InputStreamReader isr =  new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (isr);
	
	System.out.println("Enter Your name");
	String name = br.readLine();	
	System.out.println("Enter Your Roll no");
	int roll_no = Integer.parseInt(br.readLine());	
	System.out.println("Enter Your Field of Intrest");
	String intrest  = br.readLine();

	System.out.println("Hey,my name is "+name+" and my roll no is "+roll_no+" .My Field of Intrest is "+intrest);

	}



}
