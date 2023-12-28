package in.javaLearning;

class Vehicle{
	int wheels;
	String name;
	String color;
	
	Vehicle(int w,String n,String c){
		wheels = w;
		name = n;
		color = c;
	}
	Vehicle(Vehicle v1){
		wheels = v1.wheels;
		name = v1.name;
		color = v1.color;
	}
	public void show() {
		System.out.println("wheels :"+wheels+" name :"+name+" color:"+color);
	}
}

public class Constructor_3 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(4, "Santro", "red");
		v1.show();
		System.out.println(v1.hashCode()); //Interger representation of the object
		//hashcode() => is used to interger represntation of the object
		
		Vehicle v2 = new Vehicle(v1);
		v2.show();
		System.out.println(v2.hashCode());
	}

}
