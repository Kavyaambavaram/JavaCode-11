package in.javaLearning;


class FestivalDay{
	FestivalDay(){
		System.out.println("Object created");
	}
	public void getResult(FestivalDay obj) {
		if(this==obj) {
			System.out.println("Both points to same object ");
		}else {
			System.out.println("Both points to different objects");
		}
	}
}

public class This_1 {
	public static void main(String[] args) {
    FestivalDay obj = new FestivalDay();
     obj.getResult(obj);
     
     FestivalDay obj2 = new FestivalDay();
     obj.getResult(obj2);
	}
}