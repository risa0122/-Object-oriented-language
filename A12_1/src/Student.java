import java.util.*;

class Student {
	int id, tuition, sch;
	double gpa;

	Scanner sc = new Scanner(System.in);

	public void setId(int id) {
		this.id = id;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public void setSch(int sch) {
		this.sch = sch;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public int getTuition() {
		return tuition;
	}

	public int getSch() {
		return sch;
	}

	public double getGpa() {
		return gpa;
	}


	public void first() {
		System.out.println("학생의 정보를 입력한다.");
	}

	public void input() {
		System.out.print("학번은? ");
		id = sc.nextInt();
		System.out.print("등록금은? ");
		tuition = sc.nextInt();
		System.out.print("평균등급? ");
		gpa = sc.nextDouble();
	}


	public int calcScholarship() {
		sch = 0;
		return sch;
	}



	public String toString() {
		return "id="+id+" tuition="+tuition+" gpa="+gpa+ " 장학금="+sch;
	}






}
