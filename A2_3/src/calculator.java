import java.util.*;

public class calculator {
	public static void main(String args[]) {
		
		int take;
		int price;
		int tax;
		int left;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("πﬁ¿∫ µ∑: ");
		take = sc.nextInt();
		
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price = sc.nextInt();
		
		tax = (int) (price * 0.1);
		left = take - price;
		
		System.out.print("∫Œ∞°ºº: "+tax+'\n'
				+"¿‹µ∑: " + left);

	}

}
