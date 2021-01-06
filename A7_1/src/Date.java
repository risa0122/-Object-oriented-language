
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
		System.out.println("당신의 생일은 "+this.getYear()+"년 "+this.getMonth()+"월  "+this.getDay()+"일입니다.");
		System.out.println("현재 나이는 "+ this.age +"입니다.");
	}
	
}
