class Demo {


	public static void main(String [] args) {
	int num=1;
		int num1=num;
		for(int outer=1;outer<=5;outer++){
			for(int inner=1;inner<=outer;inner++){
				System.out.print(num1+" ");
				num1--;
			}
			num1=num++ +1;
			System.out.println();
		}

	}

}
