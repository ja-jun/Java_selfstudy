package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 ������ Student ��ü�� ����");
		
		Student s2 = new Student();
		System.out.println("s2 ������ Student ��ü�� ����");
		
		if(s1 == s2) {
			System.out.println("���� ��ü�� ����");			
		} else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}

}
