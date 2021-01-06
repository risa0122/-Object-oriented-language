import java.util.*;

public class RecTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력: ");
		int a = sc.nextInt();
		
		System.out.print("사각형의 새로를 입력: ");
		int b = sc.nextInt();
		
		Rectangle obj = new Rectangle(a,b);
		System.out.print("사각형의 넓이는 "+obj.area()+"이다.");
		
		
		
	}
}
