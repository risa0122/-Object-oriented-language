import java.util.*;

class Undergrad extends Student{

	int year;
	Scanner sc = new Scanner(System.in);

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}


	
	public void input() {
		System.out.println("�кλ��� ������ �Է��Ѵ�.");
		super.input();
		System.out.print("�г���? ");
		year = sc.nextInt();
	}
	
	public int calcScholarship() {
		if(gpa>=3.0) {
			sch = (int) (getTuition()*0.3);}
		else {
			sch = 0;}

		return sch;
	}
	
	public String toString() {
		return super.toString() + " �г�="+year;
	}


}
