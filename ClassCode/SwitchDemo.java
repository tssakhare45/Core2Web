

class NestedSwitch{
	
	public static void main(String [] args) {
		
	int Entry = 2;

	switch(Entry){
			case 1: 
				{
				System.out.println("COVID Ward Entry");
				char ch = 'q';
				switch(ch){
					case 'P':
					case 'p':
					System.out.println("COVID +ve");
						break;
					case 'Q':
					case 'q':
					System.out.println("In Isolation");
						break;

				}//innerswitch
				}
				break;
			case 2:
				{	
				System.out.println("Non-COVID Ward Entry");
				char c = 'n';
				switch(c){
					case 'S':
					case 's':	
					System.out.println("Serious Patient");
						break;
					case 'N':
					case 'n':
					System.out.println("Non-Serious Patient");
						break;
				}
				}
				break;
				}


	}

	}


