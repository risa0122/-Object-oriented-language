import java.util.*;

class Employee {
	String name, position;
	int id;

	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("이름은?");
		name = sc.next();
		System.out.print("직원번호는?");
		id = sc.nextInt();
		System.out.print("직급은?");
		position = sc.next();	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getId() {
		return id;
	}
	
	public int computeSalary() {return -1;}
	
	public String toString() {
		return name+"("+position+", "+id+")";
	}
	
}
