

class Demo {

	public static void main(String ... args) {

		int num1 = 40 , num2 = 70 , num3 = 30 ;
		
		if(num1 >= num2 && num1 >= num3 ){

			System.out.println("Largest number = "+num1);

		}else if(num2 >= num1 && num2 >= num3 ){

			System.out.println("Largest number = "+num2);
		}else{

			System.out.println("Largest number = "+num3);
		}

	}
}
