
public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d1;
		int d2;
		int count=0;

		
		do
		{
		
		d1=0;
		d2=0;

		Dice obj1 = new Dice(d1);
		Dice obj2 = new Dice(d2);
			
		obj1.roll();
		d1 = obj1.getValue();
		obj1.setValue(d1);
		
		obj2.roll();
		d2 = obj2.getValue();
		obj2.setValue(d2);
		
		System.out.println("주사위1 = "+d1+"\t 주사위2 = "+d2);	
		count++;
		}while (d1!=1 && d2!=1);
		
	System.out.println("(1,1)이 나오는데 걸린 횟수 = "+count);
		
		
		

	}

}
