package b1;

public class AccessModifierDemo {
	public static void main(String[] args) { //JVM // entry point
		// TODO Auto-generated method stub
		System.out.println("hello team");
		methodOne();
		int x = 10;
		int value = methodTwo(12,5, x);  //arguments
		System.out.println(value);
		// static na fixed memory , separate memory 
//		int subtractedValue = sub(5,2);
		System.out.println(sub(5,2));
//		System.out.println(subtractedValue);
	}
	 static String methodOne(){ 
		 System.out.println("method one is executed");// method name, return type, access modifier
		return "hellp";
	}
	static int methodTwo(int num1, int num2,int num3){ //parameter
		 return num1-num2;
	 }
	static int sub(int num1, int num2){
		//parameter
		 return num1-num2;
	 } 
}