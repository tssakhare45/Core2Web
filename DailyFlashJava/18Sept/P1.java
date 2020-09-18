import java.io.*;

class Demo {
		
	public static void main(String [] args) throws IOException { 
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the choice");
		System.out.println("1.Integer");
		System.out.println("2.Float");
		System.out.println("3.Character");
		System.out.println("4.String");
		int c=Integer.parseInt(br.readLine());
		switch(c){
			case 1:
				int i=Integer.parseInt(br.readLine());
				System.out.println("Integer is "+i);
				break;
			case 2:
				float f=Float.parseFloat(br.readLine());
				System.out.println("float is "+f);
				break;
			case 3:
				char ch=(char)br.read();
				System.out.println("char  is "+ch);
				break;
			case 4:
				String s=br.readLine();
				System.out.println("String is "+s);
				break;
			
			
		}

	}
}
