package sec02.exam05;

public class ThrowsExample {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lnag.String2");
	}
	
}
