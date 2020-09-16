/*				A	
			B	C	
		C	D	E	
	D	E	F	G	
E	F	G	H	I	*/


class Demo  {

	public static void main (String [] args) {
		char ch = 'A';
		for(int i =1 ; i <= 5 ;i++ ) {
			
			for(int k =4 ; k>= i ; k--) {
			
				System.out.print("	");
			}
			char b = ch;
			for(int j = 1 ; j <= i ; j++) {
				
				System.out.print(b+"	");
				b++;
			}
			System.out.println();
			ch++;
		}
		

	}

}
