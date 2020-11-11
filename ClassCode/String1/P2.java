//CompareTo Method
class Demo {


	public static void main (String [] args) {

		String s1 = "Tanmay";
		String s2 = new String("Tanmay");
		String s3 = "Nilam";
		String s4 = "Aaditya";
		String s5 = "Tanmayi";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s4));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));

	}


}
