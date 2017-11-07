package gustavtestproj;

public class TestSplitJava {

	public static void main(String[] args) {
		String testString = "HEJ | DÅ";
		
		String[] split = testString.split("\\|");
		
		System.out.println(split[0]);
		System.out.println(split[1]);

	}

}
