package in.javaLearning;
             //parameter constructor
class Employee{
	int empId  ;
	String empName ;
	
	public Employee(int id,String name){
		empId = id;
		empName = name;
		System.out.println("id :"+empId+" name :"+empName);
	}
	public void showData() {
		System.out.println("id :"+empId+" name :"+empName);
	}
}

public class Constructor_2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"harish"); //parameter constructor
		e1.showData();
		Employee e2 = new Employee(102,"Amar");
		e2.showData();
		

	}

}
