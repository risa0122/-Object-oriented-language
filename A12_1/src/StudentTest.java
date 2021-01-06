
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Student s1 = new Student();
		Student s2 = new Undergrad();
		Student s3 = new Grad();

		s1.first();
		s1.input();
		s1.calcScholarship();
		System.out.println(s1.toString());


		s2.input();
		s2.calcScholarship();
		System.out.println(s2.toString());


		s3.input();
		s3.calcScholarship();
		System.out.println(s3.toString());


	}

}
