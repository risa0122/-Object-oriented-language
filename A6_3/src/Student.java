
public class Student {
	String name;
	int rollno;
	int age;
	
	Student(String n, int r, int a){
		this.name = n;
		this.rollno = r;
		this.age = a;
	}
	void print() {
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+rollno);
		System.out.println("����: "+age);
	}

}
