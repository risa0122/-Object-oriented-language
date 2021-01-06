
public class Person {
	String name;
	float height;
	float weight;
	
	Person(){
		name = "È«±æµ¿";
		height = (float) 163.0;
		weight = (float) 48.5;				
	}
	Person(String n, float h, float w){
		this.name = n;
		this.height = h;
		this.weight = w;
	}
	void print() {
		System.out.print("ÀÌ¸§: "+name+","+" Å°: "+height+","+" ¸ö¹«°Ô: "+weight+'\n');
	}
	
	
}
