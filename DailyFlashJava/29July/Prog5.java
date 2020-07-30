
class Demo {
		static int isEven (int num ) {

		return num & 1 ;

		}
		public static void main (String ... args) {
		
			int num = 5;
		System.out.println("Number is "+num);
			
		if(isEven(num) == 0) 
		System.out.println("Number   "+num+" is Even");
		else
		System.out.println("Number  "+num+" is Odd");


		}



}
