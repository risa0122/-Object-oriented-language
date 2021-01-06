import java.util.*;

public class MtoKM {
	public static void main(String args[]) {
		
		double m;
		double km;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하시오: ");
		m = sc.nextDouble();
		km = 1.609*m;
		
		System.out.print(m+"마일은 "+km+"킬로미터입니다.");
		
		
	}
	
}
