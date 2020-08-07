
class Demo {

	public static void  main (String [] args ) {
		
		int count = 0;
		int num = 1;

		while(count != 10) {
				if(num % 32 == 0 && num % 7 == 0) {
					
				if(num % 6 == 0) 
					break;
				else 
					System.out.print(num + " ");
				}
			
				num++;
		}
		System.out.println("\nBreaking Loop");

	}
}
