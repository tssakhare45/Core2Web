 
class Demo{
	public static void main (String [] args) {

	int num = 4135;
	int rem = 0; 
	int mul = 1 , sum = 0; 
	System.out.println("Number is  " +num);

	while(num != 0) {
		
			rem = num % 10;
			if ( rem % 2 == 0)
				sum = sum + rem ;
			else
				mul = mul * rem ; 	
			num = num /10;
	}
	System.out.println("Sum of Even digit is   " +sum);
	System.out.println("Multiplication of Odd digit is   " +mul);

	}

}
