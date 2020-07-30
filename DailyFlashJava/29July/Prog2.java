 

class Demo {

	public static void main (String ... args ) {

		char chr = 'F' ; 

		System.out.println("Entered character is "+chr);
		if(chr >= 'A' && chr <= 'Z') {

			System.out.println("Lowercase is " +(char)(chr+32));
		}else if (chr >= 'a' && chr <= 'z') {
			
			System.out.println("uppatcase is " +(char)(chr-32));

		}

	}

}
