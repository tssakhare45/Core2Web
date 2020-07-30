
class Demo {

	static boolean isDivisible (int dividend , int divisor) {

	int num = dividend;

	if((dividend << divisor) == num) 
		
		return true;
	else
		return false;
	}
	public static void main(String ... args) {
		
		int dividend = 12 ; 
		int divisor = 2 ;

		boolean ans = isDivisible(dividend , divisor);

		if(ans == true) 
			System.out.println("Yes");
		else
			
			System.out.println("Yes");
	}		




}
