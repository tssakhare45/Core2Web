class Demo { 

	public static void main (String [] args) {

		 for(int outer=1;outer<=11;outer++){
			char ch='A';
                        for(int inner=1;inner<=6;inner++){
                                if((inner+outer)<=7 || (outer-inner)>=5)
                                                System.out.print(ch++ +" ");
                        }
                        System.out.println();
                }


	}	



}
