package in.javaLearning;

class StudentData {
	int studentId = 100;
	String studentName = "Kavya";

	public void showData() {
		System.out.println("Id="+this.studentId+" Name="+this.studentName);
		}
	
	public void callFn(){
//		int studentId = 101;
//		String studentName = "Sathya";
		this.showData();
//		System.out.println("Id="+studentId+" Name="+studentName);
	}
}

public class This_2 {

	public static void main(String[] args) {
		StudentData s = new StudentData();
		s.callFn();
	}

}
