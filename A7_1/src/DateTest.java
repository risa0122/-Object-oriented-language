import java.util.*;


public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int y;
		int m;
		int d;
				
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		y = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		m = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		d = sc.nextInt();

		Date obj2 = new Date(y,m,d);
		
		obj2.setYear(y);
		obj2.setMonth(m);
		obj2.setDay(d);
		
		obj2.print();
		
		

		
		
		
		
		
	}

}
