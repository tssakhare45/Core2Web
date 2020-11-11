class Demo {

	public static void main (String [] args) {
		//replace With
		String s1 = new String ("Tanmay");
		String s2 = new String ("Bielearn");
	
		s1 = s1.replace('a','t');

		System.out.println(s1);
		//StartsWith
		String s3 = new String("Bielearn");
		String s4 = new String("Biemedia");
		String s5 = new String("BieTickets");
		String s6 = new String("civicGen");
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		System.out.println(s3.startsWith("Bie"));
		System.out.println(s4.startsWith("Bie"));
		System.out.println(s5.startsWith("Bie"));
		System.out.println(s3.startsWith("Bie"));
		//ENDSWITH
		System.out.println(s3.endsWith("earn"));
		System.out.println(s4.endsWith("earn"));
		System.out.println(s5.endsWith("earn"));
		System.out.println(s6.endsWith("earn"));
	}



}
