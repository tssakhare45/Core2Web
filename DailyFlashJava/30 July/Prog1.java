
class Demo {

	public static void main (String ... args) {
		
		char ch = '*';
		int a = 10 ;
		int b = 20 ;
		switch ( ch ) {
		
				case '+' :
					System.out.println("Add = "+ (a+b));
					break;
				case '-':
					System.out.println("Sub = "+ (a-b));
					break;
				case '*':
					System.out.println("Mult = " + (a*b));
					break;
				case '/':
					System.out.println("Div = "+ (a/b));
					break;
		}

		}
}
