
class Date {

	private int year;
	private int month;
	private int day;
	int age;

	
	public void setYear(int y) {year = y;}
	public void setMonth(int m) {month = m;}
	public void setDay(int d) {day = d;}
	
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	

	public Date() {
		
	}
	
	
	public Date(int y,int m,int d) {
		
		if (m == 10) 
			if(d > 17) 
				age = 2020-y-1;
				
			else
				age = 2020-y;
		else if(m > 10)
			age = 2020-y-1;
		else 
			age = 2020-y;
	}	
			
	
	
	void print() {
		System.out.println("����� ������ "+this.getYear()+"�� "+this.getMonth()+"��  "+this.getDay()+"���Դϴ�.");
		System.out.println("���� ���̴� "+ this.age +"�Դϴ�.");
	}
	
}
