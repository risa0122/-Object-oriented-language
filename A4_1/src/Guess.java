import java.util.*;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int guess;
		int answer = (int)(Math.random()*100);
		int count = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �����Ͽ� ������: ");
			guess = sc.nextInt();
			
			if (guess>answer)
				System.out.println("HIGH");
			if (guess<answer)
				System.out.println("LOW");
			count++;
		}while (guess!=answer);
		System.out.print("�����մϴ�. �õ�Ƚ�� = "+count);
	}

}
