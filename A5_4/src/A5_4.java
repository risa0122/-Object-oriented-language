import java.util.*;

public class A5_4 {
	int input;
	
	void setInt(int i) {
		input = i;
	}
	
	void abs() {
		if (input>0) 
			System.out.println("입력된 정수"+input+"의 절대값은 "+input+"입니다");
			else 
				System.out.println("입력된 정수"+input+"의 절대값은 "+(-input)+"입니다");	
		}
	
	public static void main(String[] args) {
		int integ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		integ = sc.nextInt();
		
		A5_4 obj = new A5_4();
		obj.setInt(integ);
		obj.abs();
		
	}
	
}
