import java.util.*;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String cha;
		double number1;
		double number2;
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		cha = sc.next();
		System.out.print("���� 2���� �Է��ϼ���(ex. 3 23): ");
		number1 = sc.nextDouble();
		number2 = sc.nextDouble();
		
		if (cha.equals("+")) {
			result = number1 + number2;
			System.out.print(number1+cha+number2+" = "+result);
		}
		else if (cha.equals("-")) {
			result = number1 - number2;
			System.out.print(number1+cha+number2+" = "+result);
		}
		else if (cha.equals("*")) {
			result = number1 * number2;
			System.out.print(number1+cha+number2+" = "+result);
		}
		else {
			if(number2==0) {
				System.out.print("������ ������ �� ����");
			}
			else {
				result = number1/number2;
				System.out.print(number1+cha+number2+" = "+result);
			}
		}
	}

}
