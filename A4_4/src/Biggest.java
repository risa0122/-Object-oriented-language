import java.util.Arrays;

public class Biggest {
	public static void main(String[] args) {
		
		double[] db = {1.0, 2.0, 3.0, 4.0};
		
		double sum = 0;
		double max = db[0];
		
		System.out.println("toString() 로 출력: "+Arrays.toString(db));
		
		for (double i : db)
			System.out.print(i+" ");
		
		for (double i : db)
			sum += i;
			System.out.println("\n합은 "+ sum);
		
		for (double i: db)
			if(max<i)
				max = i;
				System.out.print("최대값은 "+max);

	}
}
