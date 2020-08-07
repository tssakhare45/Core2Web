/*
   1   4  9
   16 25 36
   49 64 81 
*/
class Pattern {

	public static void main (String [] args) {
		int num= 1;
		for(int outer = 1; outer <= 3 ; outer++) {

			for(int inner = 1; inner <= 3 ; inner++) {
		
				System.out.print(num * num + "  " );
				num++;
			}
			System.out.println();
		}

	}

}
