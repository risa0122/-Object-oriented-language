import java.util.*;

public class A5_6 {
	
	String name;
	String adress;
	
	void setName(String n) {
		name = n;
	}
	
	void setAdress(String a) {
		adress = a;
	}
	
	void adress() {
		System.out.println(name+"�� �ּҴ� "+adress+"�Դϴ�");
	}
	
	
	public static void main(String[] args) {
		
		String s1;
		String s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		s1 = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ���: ");
		s2 = sc.nextLine();
		
		A5_6 obj = new A5_6();
		obj.setName(s1);
		obj.setAdress(s2);
		obj.adress();
	}

}
