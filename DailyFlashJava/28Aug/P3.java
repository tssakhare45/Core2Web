class Demo {

	public static void main (String [] args) {
		char ch ='A';
		for(int i =1 ; i <= 4 ;i++ ) {
				
			for(int k =3 ; k >= i ; k--) {
				
				System.out.print("	");
			}
			for(int j = 1 ; j <= 2*i-1; j++) {
			
					System.out.print(ch +"	");
					ch++;
			}
			System.out.println();

		}

	}
}
