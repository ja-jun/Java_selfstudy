package sec05.exam03;

public class Car {
	int speed;
	
	static void run() {
		Car myCar = new Car();
		myCar.speed = 60;
			System.out.println(myCar.speed + "���� �޸��ϴ�.");
	}
		
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();		
	} 
}
