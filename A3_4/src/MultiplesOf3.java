import java.util.*;

public class MultiplesOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int sum = 0;
		int number;
		int result;
		int ii = 0;
	
		/*
		 * b++;
   if(b%5==0)    //5�γ����� �������� ����
   {
    System.out.println();
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		number = sc.nextInt();
		
		while (3*i<=number) {
			result = i * 3;
			System.out.print(result+" ");
			ii++;
			if(ii%5==0) {
				System.out.println();
			}
			
			sum = sum + result;
			i++;	
		}

		System.out.print("\n"+"0���� "+number+"������ 3�� ��� ��: "+sum);
	}

}
