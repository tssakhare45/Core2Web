//String Constructor

class Demo {

	public static void main(String [] args) {
		
		String s1 = new String();

		System.out.println(s1);
		System.out.println(s1.length());
		
		String s2 = new String("Pratiksha");
		System.out.println(s2);
		System.out.println(s2.length());
		
		char [] name = {'N','I','L','A','M'};
		String s3 = new String(name);
		System.out.println(s3);

		byte [] bar =  {101,102,103,104};
		String s4 = new String(bar);
		System.out.println(s4);
	}

}
