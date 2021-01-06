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
		System.out.println("학부생의 정보를 입력한다.");
		super.input();
		System.out.print("학년은? ");
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
		return super.toString() + " 학년="+year;
	}


}
