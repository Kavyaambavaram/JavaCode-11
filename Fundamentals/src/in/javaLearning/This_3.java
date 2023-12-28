package in.javaLearning;

class Student_data{
	int studentId;
	String studentName;
	
	
	Student_data(int StudentId,String StudentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public void showData() {
		System.out.println("Id="+this.studentId+" Name="+this.studentName);
	}
}
public class This_3 {

	public static void main(String[] args) {
		Student_data s = new Student_data(101, "Kavya");
		s.showData();
	}

}
