package b1;

public class SelectionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if, else if 
		int money = 4;
		int pen = 10;
		int pencil = 5;
		if(money>=pen) {
			System.out.println("u can buy pen");
		}
		else if(money>=pencil) {
			System.out.println("u can buy pencil");
		}
		else {
			System.out.println("u can't buy ");
		}
		// switch cases 
		int day = 9;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("none of the condition passed. Irrelevant dy ");
		}
		int i = 1;
				while(i<10) {
					System.out.println(i);
					i++;
				}
				
				do {
					System.out.println(i);
					break;
				}
				while(i<10);


		for( int j = 1  ;  j<5  ;   j++  ) {
			for( int k = 1  ;   k<=j  ;   k++   ) {
				System.out.println(j*2);
			}
		}
		
		for(int i = 0; i<5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}


	}

}
