
public class Car{
	
	String color;
	void setColor(String c) {
		color = c;
	}
	
	int speed;
	void setSpeed(int s) {
		speed = s;
	}

	int gear;
	void setGear(int g) {
		gear = g;
	}
	
	void print() {
		
		System.out.println("color : "+color+", "+"speed : "+speed);
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.setColor("red");
		obj.setSpeed(150);
		obj.print();
	}
	

}
