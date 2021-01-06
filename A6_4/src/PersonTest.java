import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은? : ");
		String a = sc.next();
		
		System.out.print("키는? : ");
		float b = sc.nextFloat();
		
		System.out.print("몸무게는? : ");
		float c = sc.nextFloat();
		
		Person obj1 = new Person();
		obj1.print();
		
		Person obj2 = new Person(a,b,c);
		obj2.print();
	}

}
