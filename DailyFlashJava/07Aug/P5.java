
class Demo {

	public static void main (String [] args) {
	
		int num = 3476;
		int num1 = num, sum=0 ;
		int rem = 0,cnt = 0;
		float avg;

		while(num != 0 ) {
				
			rem = num % 10;
			sum = sum +rem;
			cnt++;
			num = num /10;
		}
		avg =	(float) sum / cnt;
		System.out.println("Avgearge of "+num1+ " is  "+avg);

	}

}
