
public class Dice {
	private int value;
	
	public void roll() {
		value = (int) (Math.random()*6+1);

	}
	
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int v) {
		value = v;
	}

	
	public Dice(int d) {
		value = d;
		
	}

}
