import java.util.*;

public class A5_4 {
	int input;
	
	void setInt(int i) {
		input = i;
	}
	
	void abs() {
		if (input>0) 
			System.out.println("�Էµ� ����"+input+"�� ���밪�� "+input+"�Դϴ�");
			else 
				System.out.println("�Էµ� ����"+input+"�� ���밪�� "+(-input)+"�Դϴ�");	
		}
	
	public static void main(String[] args) {
		int integ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		integ = sc.nextInt();
		
		A5_4 obj = new A5_4();
		obj.setInt(integ);
		obj.abs();
		
	}
	
}
