import java.util.*;

public class BiggestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
		int biggest = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���");
		num2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���");
		num3 = sc.nextInt();
		
		if ((num1>=num2)&(num1>=num3)) {
			biggest = num1;
		}
		else if ((num2>=num1)&(num2>=num3)) {
			biggest = num2;
		}
		else {
			biggest = num3;
		}
		System.out.print("���� ū ���ڴ� "+biggest+"�Դϴ�.");
	}

}
