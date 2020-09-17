class Demo { 

	public static void main (String [] args) {

		for(int outer=1;outer<=5;outer++){
			int cnt=1;
			for(int inner=1;inner<=5;inner++){
				if(outer==1 || outer==5)
					System.out.print(outer+" ");
				else{
					if(cnt<=2){
					System.out.print(outer+" ");
					cnt++;
					}

				}


			}
			System.out.println();
		}


	}	



}
