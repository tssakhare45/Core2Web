class Demo {

	public static void main (String [] args) {
			int m;
		  for(int outer=5;outer>=1;outer--){
                        for( m=1;m<outer;m++)
                                System.out.print(" "+" ");
                        for(int inner=m;inner<=5;inner++){
                         System.out.print(((inner+outer)%2==0) ?"0 ":"1 " );
                        }
                        System.out.println();
                	}
	}
}
        	
