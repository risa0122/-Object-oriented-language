import java.util.Arrays;

public class Biggest {
	public static void main(String[] args) {
		
		double[] db = {1.0, 2.0, 3.0, 4.0};
		
		double sum = 0;
		double max = db[0];
		
		System.out.println("toString() �� ���: "+Arrays.toString(db));
		
		for (double i : db)
			System.out.print(i+" ");
		
		for (double i : db)
			sum += i;
			System.out.println("\n���� "+ sum);
		
		for (double i: db)
			if(max<i)
				max = i;
				System.out.print("�ִ밪�� "+max);

	}
}
