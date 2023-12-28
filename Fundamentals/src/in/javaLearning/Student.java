package in.javaLearning;

public class Student {
	int id = 1; // Instance variable
	String name = "kavya"; // Instance variable
	static String college = "svist"; // Static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		System.out.println(obj.id);

		Student obj2 = new Student();
		System.out.println(obj2.name);

		Student obj3 = new Student();
		System.out.println(obj2.college);
		// it's also possible through another way 
		System.out.println(Student.college);
	}

}
