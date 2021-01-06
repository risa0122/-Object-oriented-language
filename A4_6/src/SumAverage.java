import java.util.*;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력받은 학생의 수는? : ");
		n = sc.nextInt();
		int[] list = new int[n];
		
		while (i < list.length) {
			System.out.print((i+1)+"번쩨 학생의 성적을 입력하세요: ");
			sum += sc.nextInt();
			i++;
		}
		System.out.println("합계: "+ sum);
		System.out.println("평균: "+ (double)sum/n);
	
		
		
	}

}
