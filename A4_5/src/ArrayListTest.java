import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Double> list = new ArrayList<>();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		double sum = 0;
		double max = list.get(0);

		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		
		for (int i=0; i<list.size(); i++)
			sum += list.get(i);
			System.out.println("\n합은 "+sum);
			
		for (int i=0; i<list.size(); i++)
			if(list.get(i)>max)
				max = list.get(i);
		System.out.println("최대값은 "+max);
	}

}
