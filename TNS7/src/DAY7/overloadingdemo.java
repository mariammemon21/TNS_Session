package DAY7;

public class overloadingdemo {
	public static void main(String[] args) {
		
		System.out.println("----Contructor Overloading-----");
		
		point p1 = new point(14.5f);
		System.out.println(p1);
		
		point p2 =  new point(12.5f, 20.50f);
		System.out.println(p2);
		
		System.out.println("----Methpd Overloading-----");
		System.out.println("2 integers "+ methodoverloading.addition(5, 100));
		System.out.println("2 Floats "+ methodoverloading.addition(12.0f, 100));
		
		
		
	}

}
