/* 25
   16	25
   9	16	25
   4	9	16	25
   1	4	9	16	25*/ 

class Demo {


	public static void main (String [] args) {
		int num =5;
		for(int i = 1 ; i<= 5 ; i++) {
			int b = num;
			for(int j =1 ; j <= i ; j++ ) {
	
				System.out.print((b*b)+ "	");
				b++;			

			}
			num--;
			System.out.println();
		}

	}
}
