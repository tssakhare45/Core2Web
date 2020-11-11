//concat Method (1)
class Demo {


	public static void main (String [] args) {

		String s1 = "Tanmay";
		String s2 = "Sakhare";
		String s3 = "Pratiksha";
		s1 = s1.concat (s2);
		s3 = s3.concat(s2);
		System.out.println(s1); //TanmaySakhare
		System.out.println(s2); //Sakhare
		System.out.println(s1.concat(s2)); //TanmaySakhare
		System.out.println(s3);//PartikshaSakhare
		


	}


}
