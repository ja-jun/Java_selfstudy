package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(60);
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);			
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}

}