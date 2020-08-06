 //Adding digit from given num
class WhileDemo {

	public static void main (String [] args) {
	
		int rem = 0;
		int sum = 0;
		int num = 6431;
		while(num != 0) {
		
				rem = num % 10 ;
				sum = sum + rem ;
				num = num /10;

		}
		System.out.println("Sum  = "+sum);

	}


}
