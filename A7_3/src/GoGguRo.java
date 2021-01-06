import java.util.*;


public class GoGguRo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;
		String capital;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		a = sc.next();
		
		capital = a.toUpperCase();
		System.out.println("대문자로 변환: "+capital);

		

		
		for (int i=a.length()-1; i>=0; i--) 
			System.out.println(capital.charAt(i));
			
		
	}
		
}
