import java.io.*;

class PlayerInfo {

	public static void main (String [] args) throws IOException {	
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Player Info..");
		System.out.println("Enter Jersy number..");
		int jer_no = Integer.parseInt(br.readLine());
		System.out.println("Enter Grade of Player..");
		char grade = (char) br.read();
		br.skip(1);
		System.out.println("Enter Name of Player..");
		String name = br.readLine();
		System.out.println("Enter Avg of Player..");
		double avg = Double.parseDouble(br.readLine());

		System.out.println("Jersy no : "+jer_no);
		System.out.println("Grade of Player: "+grade);
		System.out.println("Name of Player : "+name);
		System.out.println("Avg of Player : "+avg);


	}


}
