import java .io.*;
import java.util.*;
class Demo {

	public static void main (String [] args) throws IOException {
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	String EmpDetail = br.readLine();
	StringTokenizer st = new StringTokenizer(EmpDetail,"@");

	String Token1 = st.nextToken();	
	String Token2 = st.nextToken();	
	String Token3 = st.nextToken();	

	System.out.println(Token1);
	System.out.println(Token2);
	System.out.println(Token3);



	}


}
