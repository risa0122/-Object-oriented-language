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
		System.out.println("�л��� ������ �Է��Ѵ�.");
	}

	public void input() {
		System.out.print("�й���? ");
		id = sc.nextInt();
		System.out.print("��ϱ���? ");
		tuition = sc.nextInt();
		System.out.print("��յ��? ");
		gpa = sc.nextDouble();
	}


	public int calcScholarship() {
		sch = 0;
		return sch;
	}



	public String toString() {
		return "id="+id+" tuition="+tuition+" gpa="+gpa+ " ���б�="+sch;
	}






}
