import java.util.*;

class HourlyEmployee extends Employee {
	
	int rate, hours;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		super.input();
		System.out.print("시급은?");
		rate = sc.nextInt();
		System.out.print("일한 시간은?");
		hours = sc.nextInt();
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int computeSalary() {
		return (rate*hours);
	}
	
	public String toString() {
		return super.toString()+"의 지급 급여는 "+computeSalary();
	}
	
	
	

}
