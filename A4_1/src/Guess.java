import java.util.*;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int guess;
		int answer = (int)(Math.random()*100);
		int count = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("정답을 추측하여 보세요: ");
			guess = sc.nextInt();
			
			if (guess>answer)
				System.out.println("HIGH");
			if (guess<answer)
				System.out.println("LOW");
			count++;
		}while (guess!=answer);
		System.out.print("축하합니다. 시도횟수 = "+count);
	}

}
