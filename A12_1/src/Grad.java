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
		System.out.print("연구실? ");
		lab = sc.next();
	}

	public String toString() {
		return super.toString()+" 연구실="+lab;

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
