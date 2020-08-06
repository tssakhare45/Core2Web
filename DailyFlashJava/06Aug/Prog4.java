class Demo {

	public static void main (String [] args)  { 
	
		for(int i = 100 ; i >= 1 ; i--){
			
			System.out.print(i + " " );
		}
		System.out.print("\n");
		System.out.println("Divisible by 5");
		for(int i = 100 ; i>= 1 ; i--) {
			if(i % 5 == 0) {
			System.out.println(i);
			}
		}
	}


}
