
public class Date {

	int year;
	int month;
	int day;
	
	Date(int y,int m, int d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	void print() {
		System.out.println("당신의 생일은 "+year+"년"+month+"월"+day+"일"+" 이네요!");
	}
	
}
