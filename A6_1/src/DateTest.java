import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("태어난 년도를 입력하세요: ");
		int y = sc.nextInt();
		
		System.out.print("태어난 월을 입력하세요: ");
		int m = sc.nextInt();
		
		System.out.print("태어난 날짜를 입력하세요: ");
		int d = sc.nextInt();
		
		Date obj = new Date(y,m,d);
		obj.print();
	}

}
