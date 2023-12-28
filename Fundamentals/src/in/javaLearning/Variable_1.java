package in.javaLearning;


        // Instance Variables //


public class Variable_1 {
	int a = 100; // instance variable

	public static void main(String[] args) {
		// create obj ==> classname objName = new className();
		Variable_1 obj = new Variable_1();
		// another way to creating objects
		System.out.println(obj instanceof Variable_1);

		// accesing instance variable : objectName.VarName
		System.out.println(obj.a);

		System.out.println(".................");
		Variable_1 obj2 = new Variable_1();
		System.out.println(obj2.a);
		obj.a = 500;
		System.out.println(obj.a);
		System.out.println(obj2.a);

	}

}
