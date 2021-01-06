import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오.: ");
		String a = sc.next();
		System.out.print("학번을 입력하시오: ");
		int b = sc.nextInt();
		System.out.print("나이를 입력하시오: ");
		int c = sc.nextInt();
		
		Student obj = new Student(a,b,c);
		obj.print();
	}

}
