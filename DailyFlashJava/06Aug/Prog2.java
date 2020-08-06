
class Demo {

	public static void main (String [] args) {

		int year = 3;

		switch (year) {

			case 1:
				System.out.println("1st year student not eligible ");
				break;
			case 2 :
				System.out.println("2nd year student not eligible ");
				break;
			case 3: {
				int marks = 82;
				switch(marks) {
					
						case 82 :
							System.out.println("Student are eligible for scholarship");
							break;	

				}
			}	

		}

	}

}
