import java.util.*;

public class calculator {
	public static void main(String args[]) {
		
		int take;
		int price;
		int tax;
		int left;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��: ");
		take = sc.nextInt();
		
		System.out.print("��ǰ ����: ");
		price = sc.nextInt();
		
		tax = (int) (price * 0.1);
		left = take - price;
		
		System.out.print("�ΰ���: "+tax+'\n'
				+"�ܵ�: " + left);

	}

}
