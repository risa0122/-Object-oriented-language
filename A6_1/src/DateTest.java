import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		int y = sc.nextInt();
		
		System.out.print("�¾ ���� �Է��ϼ���: ");
		int m = sc.nextInt();
		
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		int d = sc.nextInt();
		
		Date obj = new Date(y,m,d);
		obj.print();
	}

}
