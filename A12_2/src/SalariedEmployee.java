import java.util.*;

class SalariedEmployee extends Employee {
	
	int monthly;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		super.input();
		System.out.print("������?");
		monthly = sc.nextInt();
	}
	
	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}
	
	public int getMonthly() {
		return monthly;
	}
	
	public int computeSalary() {
		return monthly*12;
	}
	
	public String toString() {
		return super.toString()+"�� ������ "+computeSalary();
	}
	
	
	

}
