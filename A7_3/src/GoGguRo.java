import java.util.*;


public class GoGguRo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;
		String capital;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		a = sc.next();
		
		capital = a.toUpperCase();
		System.out.println("�빮�ڷ� ��ȯ: "+capital);

		

		
		for (int i=a.length()-1; i>=0; i--) 
			System.out.println(capital.charAt(i));
			
		
	}
		
}
