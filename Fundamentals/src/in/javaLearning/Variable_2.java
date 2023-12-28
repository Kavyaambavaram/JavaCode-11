package in.javaLearning;


                   //Static Variables //

public class Variable_2 {
    static int b = 200;
	public static void main(String[] args) {
		//accessing static data : Classname.VarName
		System.out.println(Variable_2.b);
		System.out.println("--------------");
		Variable_2 obj = new Variable_2();
		System.out.println(obj.b);
		
		System.out.println("--------------");
		System.out.println("--------------");
		Variable_2 obj2 = new Variable_2();
		System.out.println(obj2.b);
		obj.b = 300;
		System.out.println(obj.b);
		System.out.println(obj2.b);

	}

}
