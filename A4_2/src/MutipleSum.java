
public class MutipleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i=1;i<=100;i++)
			if(i%3==0 || i%4==0)
				sum += i;
		System.out.printf("3 �Ǵ� 4�� ����� ��=%d",sum);
			
	
	}

}
