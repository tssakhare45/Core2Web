class Demo { 

	public static void main (String [] args) {

		int num=1;
		int num1=num;
		int inner;
		for(int outer=1;outer<=5;outer++){
			int a=1;
			for( inner=5;inner>=outer;inner--){
				System.out.print(num1++ +"	");
			}
			for(int side=7-outer;side<=5;side++)
				System.out.print(a++ +"	");
			num1=num++ +1;
			System.out.println();
		}


	}	

}
