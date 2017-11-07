package gustavtestproj;

public class testFizzBuzz {
	
	private static String fizzString = "Fizz";
	private static String buzzString = "Buzz";

	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			boolean fizz = false;
			boolean buzz = false;
			if(i % 3 == 0){
				fizz = true;
			}
			if(i % 5 == 0){
				buzz = true;
			}
			if(fizz && buzz){
				System.out.println(fizzString + buzzString);
			}else if(fizz){
				System.out.println(fizzString);
			}else if(buzz){
				System.out.println(buzzString);
			}else{
				System.out.println(i);
			}
		}
	}

}
