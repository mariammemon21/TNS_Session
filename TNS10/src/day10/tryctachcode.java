package day10;

public class tryctachcode {
	static void performdiv(int x , int y) {
		System.out.println("I am in method");
		
		int z;
		try {
		System.out.println("I am in try block");
		z=x/y;
		System.out.println("Result of z:"+z);
		}
		catch (ArithmeticException a) {
			System.err.println("I am in catch block :"+ a.getMessage());
		}
	}

}
