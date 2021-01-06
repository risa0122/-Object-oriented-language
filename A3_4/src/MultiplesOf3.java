import java.util.*;

public class MultiplesOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int sum = 0;
		int number;
		int result;
		int ii = 0;
	
		/*
		 * b++;
   if(b%5==0)    //5로나누어 떨어지면 개행
   {
    System.out.println();
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구하려는 범위의 숫자를 입력하세요: ");
		number = sc.nextInt();
		
		while (3*i<=number) {
			result = i * 3;
			System.out.print(result+" ");
			ii++;
			if(ii%5==0) {
				System.out.println();
			}
			
			sum = sum + result;
			i++;	
		}

		System.out.print("\n"+"0부터 "+number+"까지의 3의 배수 합: "+sum);
	}

}
