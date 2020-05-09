package overloading;

public class TestOverloading {
	
	private static void printData(double doubleData) {
		System.out.println(doubleData);
	}
	
	private static void printData(String strData) {
		System.out.println(strData);
	}
	
	private static void printData(String strData, int val) {
		System.out.println(strData);
	}
	
	private static void printData(int intData) {
		System.out.println(intData);
	}
	
	public static void main(String[] args) {
		TestOverloading.printData("0d");
	}

}
