package b1;

import java.util.Arrays;
/*
 * demo for datatypes 
 */
public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		10 rupee biscuit
//		biscuit choc = 10;
		byte biscuitPrice = 10;
		byte lays = 50;
		int ice = 50; //space storage
		short i = 50;
		int chocoBar = 200;
		short iceCrea = 90;
		int number = 128;// byte means, size exceeding
//		datatype variablename assignment operator value
//		System.out.println("128");
//		System.out.println(number); // know diff b/w "
		long number2 = 30L;
		long number23 = 40L; //no duplicate variable 
		float a = 4.088f;
		double b = 23.89898989;
		char data = 'a'; //single quotes
		char Data = 'a'; //case sensitive
//		char char = 'd';   // don't ue keywords. ? fixed for particular purpose
		int d =10;  //initialization
		int e = 80;  // declaration 
		System.out.println("java");
		System.out.println("program");
		System.out.print("java ");
		System.out.print("program");
		System.out.println();
//		boolean baloon = true;
//		
//		byte number5 = 1, number6 = 2;
//		byte number8 = 3;
//		byte number9 = 4;
//		byte number10 = 5;
		
/*		int[] number5 = new int[5];
		number5[2]  = 33;
		number5[1]  = 13;
		number5[0] = 22;
		*/
//		System.out.println(number5[7]);
		int[] arrayEg = new int[] {3,4,5,8,9};
//		System.out.println(arrayEg.);
//		System.out.println(Arrays.toString(number5));  // to display all data in array 
		String stringEx = " HElLO    ";
		String java = "JAVA_Program_is_today";
		String program = "java";
//		System.out.println(stringEx.length());
		System.out.println(stringEx.charAt(3));
		System.out.println(stringEx.toUpperCase());
		System.out.println(stringEx.trim());
		System.out.println(java.compareTo(program));
		System.out.println(java.compareToIgnoreCase(program));
		System.out.println(java.split("_").toString());
		
		String[] alpha = java.split("_");
		System.out.println(alpha);
		
//		System.out.println(java.comp
//		System.out.println(stringEx);
//		
		
	}

}
