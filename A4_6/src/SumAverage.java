import java.util.*;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է¹��� �л��� ����? : ");
		n = sc.nextInt();
		int[] list = new int[n];
		
		while (i < list.length) {
			System.out.print((i+1)+"���� �л��� ������ �Է��ϼ���: ");
			sum += sc.nextInt();
			i++;
		}
		System.out.println("�հ�: "+ sum);
		System.out.println("���: "+ (double)sum/n);
	
		
		
	}

}
