 //Reversing number
class ForDemo {

	public static void main (String [] args) {
	
		int rem = 0;
		int rev = 0;
		int num = 6431;
		for( ; num != 0 ; num = num / 10 ) {
		
				rem = num % 10 ;
				rev = rev * 10 + rem ;

		}
		System.out.println("reverse is  = "+rev);

	}


}
