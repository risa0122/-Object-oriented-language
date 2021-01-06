import java.util.*;

public class A5_3 {
	
		
	int input1;
	int input2;
		
	void setInt1(int a){
		input1 = a;
	}
		
	void setInt2(int b) {
		input2 = b;
	}
		
	void sum(){
		System.out.println(input1+" + "+input2+" = "+ (int)(input1+input2) );
	}

	
	public static void main(String[] args) {
		int i1;
		int i2;
		
		A5_3 obj = new A5_3();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		i1 = sc.nextInt();
		obj.setInt1(i1);
		
		System.out.print("정수를 입력하세요: ");
		i2 = sc.nextInt();
		obj.setInt2(i2);
		
		obj.sum();
	}
	
	
}
