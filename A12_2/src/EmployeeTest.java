
public class EmployeeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Employee e1 = new Employee();
	Employee e2 = new SalariedEmployee();
	Employee e3 = new HourlyEmployee();
	
	e1.input();
	e1.computeSalary();
	System.out.println(e1.toString());
	
	e2.input();
	e2.computeSalary();
	System.out.println(e2.toString());
	
	e3.input();
	e3.computeSalary();
	System.out.println(e3.toString());
	
		
	}

}
