import java.util.*;

public class RecTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� ���θ� �Է�: ");
		int a = sc.nextInt();
		
		System.out.print("�簢���� ���θ� �Է�: ");
		int b = sc.nextInt();
		
		Rectangle obj = new Rectangle(a,b);
		System.out.print("�簢���� ���̴� "+obj.area()+"�̴�.");
		
		
		
	}
}
