import java.util.Scanner;

public class Student {
	
	String name;
	int rollno;
	int age;
	
	void setName(String n) {
		name = n;
		
	}
	void setRollno(int i1) {
		rollno = i1;
		
	}
	void setAge(int i2) {
		age = i2;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String n;
		int i1;
		int i2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �̸�: ");
		n = sc.nextLine();
		
		System.out.print("�л��� �й�: ");
		i1 = sc.nextInt();
		
		System.out.print("�л��� ����: ");
		i2 = sc.nextInt();
		
		Student obj = new Student();
		obj.setName(n);
		obj.setRollno(i1);
		obj.setAge(i2);
		
	
	}

}
