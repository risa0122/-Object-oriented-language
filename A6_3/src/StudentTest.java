import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�.: ");
		String a = sc.next();
		System.out.print("�й��� �Է��Ͻÿ�: ");
		int b = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int c = sc.nextInt();
		
		Student obj = new Student(a,b,c);
		obj.print();
	}

}
