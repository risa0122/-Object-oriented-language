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
		System.out.println(name+"의 주소는 "+adress+"입니다");
	}
	
	
	public static void main(String[] args) {
		
		String s1;
		String s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		s1 = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		s2 = sc.nextLine();
		
		A5_6 obj = new A5_6();
		obj.setName(s1);
		obj.setAdress(s2);
		obj.adress();
	}

}
