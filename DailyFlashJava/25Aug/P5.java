class Demo {

	public static void main(String ... args) {

		for (int outer =1; outer <=4 ; outer++) {

			
		for (int inner =1; inner <=4 ; inner++) {

			if (outer % 2 == 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();

		}

	}


}
