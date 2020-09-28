import java.io.*;

class Demo {

	public static void main (String [] args) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter the length of Side of square");

	int side = Integer.parseInt(br.readLine());

	int area = side * side ;

	int perimeter = 4 * side;

	System.out.println("Length of square "+side);
	System.out.println("Area of Square "+area);
	System.out.println("Perimeter of Square : "+perimeter);


	}



}
