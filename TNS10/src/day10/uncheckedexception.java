package day10;

public class uncheckedexception {
	public static void main(String[] args) {
		
		int x[];
		try {
			x = new int[] {1 , 2 , 3 , 4, 5 , };
			
			System.out.println(x[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specified index does not exist "+ e.getMessage());
			
		}
	}
}
