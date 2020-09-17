class Demo { 

	public static void main (String [] args) {

	for(int outer=1;outer<=5;outer++){
			int num=3;
			int flag=0;
			for(int inner=1;inner<=5;inner++){
				if(outer%2==0){
					if(inner==1 ||inner==5)
						System.out.print(num+" ");
					else
						System.out.print((num-1) +" ");
				}
				else if(outer==1 ||outer==5){
					System.out.print(num+" ");
				}
				else{
					if(num>=1 && flag==0){
						System.out.print(num+" ");
						num--;
					}
					else{
						if(num==0)
							num++;
						num++;
						System.out.print(num+" ");
							flag=1;
						
					}
				
				}

			}
			System.out.println();
		}


	}	



}
