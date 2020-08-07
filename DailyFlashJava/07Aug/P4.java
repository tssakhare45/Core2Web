
class Demo {

	public static void main (String [] args) {

		int num = 123875;
		int num1 = num ;
		int rem = 0,max = 0;

		while(num != 0) {	
		
			rem = num % 10;
			if(rem > max)
				max = rem ;
			num = num / 10 ; 
		}
		System.out.println("The maximum number in "+num1 + " is  " +max);
	}


}
