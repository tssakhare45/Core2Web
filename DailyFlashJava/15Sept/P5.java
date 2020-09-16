class Demo  {

	public static void main (String [] args) {
		int num = 1;
		for(int i =1 ; i <= 5 ;i++ ) {
			int  b = num;
			for(int j = 5 ; j >= i ; j--) {
				
				System.out.print(b+"	");
				b++;
			}
			System.out.println();
			num=num+2;
		}
		

	}

}
