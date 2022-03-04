package b1;
class Car{
	String color;
	int seats;
	Car(String carColor, int numberOfSeats){
		color = carColor;
		seats = numberOfSeats;
	}
	public void start() {
		System.out.println("car go ");
	}
	public void breakCar() {
		System.out.println("car break ");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car("black",3);
        audi.start();
        audi.breakCar();
        
		System.out.println(audi.color);
		System.out.println(audi.seats);
		Car bmw = new Car("green", 8);
//		bmw.color =  "white";
//		bmw.seats = 3;
		System.out.println(bmw.color);
		System.out.println(bmw.seats);
	}
}
// to intialize the objects
// 1. name must be same as the class name
//2. if we don't give constructor , then constructor wil be automatically created
//. set default values
//default , parameterised