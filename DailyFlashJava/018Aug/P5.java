class Demo {

	public static void main(String [] args) {
		
		int num1 = 4,num2 = 5, num3 = 6;
		
		if((num1 > num2) && (num1 >num3)) 
			System.out.println(num1+" is max");	
		else if((num2 > num1) && (num2 > num3)) 
			System.out.println(num2+" is max");
		else
			System.out.println(num3+" is max");
	}


}
