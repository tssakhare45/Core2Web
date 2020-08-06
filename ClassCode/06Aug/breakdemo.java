

class BreakDemo {

	public static void main (String [] args) {

		for(int i = 1 ; i<= 30 ; i++){
			
			if(i % 2 == 0 && i % 10 == 0 )
				break;
			else
				System.out.println("Num = " + i);

		}
		System.out.println("Out of For loop");

	}

}
