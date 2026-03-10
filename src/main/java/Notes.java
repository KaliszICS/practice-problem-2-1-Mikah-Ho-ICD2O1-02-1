class Notes {
	public static void main(String args[]) { //this is a function
		System.out.println(add(3, 5));
		// System.out.println(add(2.5, 3)); //doesn't work because the argument and parameter data types don't match.
		System.out.println(addS("Hello"));
	}
	//when creating your own methods/functions, they need to be in the class but outside other methods/functions


	//function

	public static int add(int num1, int num2) { //static is what makes this a function.  In other words it doesn't need an object to run
		int result;
		result = num1 + num2;
		return result;		
	}

	public static String addS(String word) { //return type must line up with the return's data type
		String wordWithS;
		wordWithS = word + "s";
		return wordWithS; //data type has to match the one in the defition
	}
}