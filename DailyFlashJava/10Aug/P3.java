class Demo  {

	public static void main(String [] args) {
		int cnt;
		for(int i =1 ; i <=20 ; i++) {
			cnt =0;
			for(int num=1 ; num <=i ;num++) {
				if(i % num == 0)
					cnt ++;

			}
			if(cnt == 2)
				System.out.print(i+ " ");
		}
		System.out.println();
	}
	

}
