package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
	
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: " + value);
		
		int result = obj + 100;
		System.out.println("value: " + result);
		
	}

}
