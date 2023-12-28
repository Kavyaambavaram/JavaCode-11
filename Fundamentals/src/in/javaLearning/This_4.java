package in.javaLearning;


class EmployeeData{
	EmployeeData(){
		System.out.println("Default constructor");
	}
	EmployeeData(int a){ 
		this(); // new Employee()
		System.out.println("Parameterized constructor");
	}
}
public class This_4 {

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData(10);

	}

}
