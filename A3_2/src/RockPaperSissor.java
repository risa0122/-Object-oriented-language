import java.util.*;

public class RockPaperSissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1;
		String input2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����,����,�� �߿��� �Է��ϼ���");
		System.out.print("User A >> ");
		input1 = sc.next();
		System.out.print("User B >> ");
		input2 = sc.next();
		
		if (input1.equals("����")&input2.equals("����")) {
			System.out.print("�����ϴ�.");
		}
		else if (input1.equals("����")&input2.equals("����")) {
			System.out.print("�����ϴ�.");
		}
		else if (input1.equals("��")&input2.equals("��")) {
			System.out.print("�����ϴ�.");
		}
		else if (input1.equals("����")&input2.equals("��")) {
			System.out.print("A�� �̰���ϴ�.");
		}
		else if (input1.equals("����")&input2.equals("����")) {
			System.out.print("A�� �̰���ϴ�.");
		}
		else if (input1.equals("��")&input2.equals("����")) {
			System.out.print("A�� �̰���ϴ�.");
		}
		else if (input1.equals("����")&input2.equals("����")) {
			System.out.print("B�� �̰���ϴ�.");
		}
		else if (input1.equals("����")&input2.equals("��")) {
			System.out.print("B�� �̰���ϴ�.");
		}
		else {
			System.out.print("B�� �̰���ϴ�.");
		}
		
	}

}
