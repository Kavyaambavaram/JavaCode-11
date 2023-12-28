package in.javaLearning;

public class Method_1 {
	// definition of function

	// non-static function
	public void greet() {
		System.out.println("Hello");
	}

	// static function
	public static void greet2() {
		System.out.println("Static function called");
	}

	public int addNumber() {
		return (10 + 12); // 22
	}
	public void show(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		// Invoke or call the objects
		// non-static function the objects creation is mandatary
		Method_1 obj = new Method_1();
		obj.greet();
		System.out.println("-----------");
		// static the class name is required to call the objects
		Method_1.greet2();
		System.out.println("-----------");
		int result = obj.addNumber(); // 22
		System.out.println(result);
		System.out.println("-----------");
		System.out.println(obj.addNumber());
		System.out.println("-----------");
		obj.show("Kavya");
	}  

}
