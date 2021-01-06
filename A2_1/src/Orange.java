import java.util.*;

public class Orange {
	public static void main(String args[]) {
		
		int num;
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오렌지의 개수를 입력하시오: ");
		num = sc.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		System.out.println(a+"박스가 필요하고 "
				+b+"개가 남습니다.");
	}
	

}


// 오렌지 127개가 있다면, 12박스가 필요하고 7개가 남습니다.