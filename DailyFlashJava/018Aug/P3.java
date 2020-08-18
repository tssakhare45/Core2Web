

class Demo {
	
	public static void main (String [] args) {
		char ch = '*';
		if((ch >= 'A'&& ch <='Z') || (ch >= 'a' && ch <= 'z') ) 
			System.out.println(ch+" is Alphabet");
		else if((ch >= '0'&& ch <='9') )
			System.out.println(ch+" is Digit");	
		else	
			System.out.println(ch+" is special character");	
	}

}
