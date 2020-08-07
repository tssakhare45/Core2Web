 
class Demo{
	public static void main (String [] args) {

	int num = 6542;
	int count = 0 ,rem = 0; 
	System.out.println("Number is  " +num);

	while(num != 0) {
		
			rem = num % 10;
			count++;
			num = num /10;
	}
	System.out.println("Total digit in number is  " +count);

	}

}
