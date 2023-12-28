package in.javaLearning;

public class TypeCasting {
	public static void implicitTypeCasting() {
		byte a =120; // local variable 
		short b= a;
		System.out.println(b);
	}
	public static void explicitTypeCasting() {
		short a =120;
		byte b = (byte)a;
		System.out.println(b);
		
		short a1 =160;
		byte b1 = (byte)a1; // (byte) => indicating that you want to convert the short value to a byte.
		System.out.println(b1); //convert into binary terms
	}

	public static void main(String[] args) {
		TypeCasting.implicitTypeCasting();
		TypeCasting.explicitTypeCasting();

	}

}
