import java.util.*;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�.(ex. 80 4 /) ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next();
		
		if(c.equals("+")) {
			Add calc = new Add();
			System.out.print(calc.calculate(a,b));
		}
		else if(c.equals("-")) {
			Sub calc = new Sub();
			System.out.print(calc.calculate(a,b));
		}
		else if(c.equals("*")) {
			Mul calc = new Mul();
			System.out.print(calc.calculate(a,b));
		}
		else if(c.equals("/")) {
			Div calc = new Div();
			System.out.print(calc.calculate(a,b));
		}
		else {
			System.out.println("�߸��� �������Դϴ�.");
		}
			
		
	}

}
