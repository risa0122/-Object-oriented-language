import java.util.*;

class Grad extends Student {

	String lab;

	Scanner sc = new Scanner(System.in);

	public void setLab(String lab) {
		this.lab = lab;
	}

	public String getLab() {
		return lab;
	}

	public void input() {
		super.input();
		System.out.print("������? ");
		lab = sc.next();
	}

	public String toString() {
		return super.toString()+" ������="+lab;

	}
	
	public int calcScholarship() {
		if(super.gpa>=3.5) {
			super.sch = (int) (super.getTuition()*0.5);}
		else{
			super.sch = (int) (super.getTuition()*0.1);}
		super.setSch(super.sch);
		return super.sch;
	}


}
