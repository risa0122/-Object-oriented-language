import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸���? : ");
		String a = sc.next();
		
		System.out.print("Ű��? : ");
		float b = sc.nextFloat();
		
		System.out.print("�����Դ�? : ");
		float c = sc.nextFloat();
		
		Person obj1 = new Person();
		obj1.print();
		
		Person obj2 = new Person(a,b,c);
		obj2.print();
	}

}
