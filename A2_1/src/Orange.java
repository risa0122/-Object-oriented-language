import java.util.*;

public class Orange {
	public static void main(String args[]) {
		
		int num;
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		num = sc.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		System.out.println(a+"�ڽ��� �ʿ��ϰ� "
				+b+"���� �����ϴ�.");
	}
	

}


// ������ 127���� �ִٸ�, 12�ڽ��� �ʿ��ϰ� 7���� �����ϴ�.