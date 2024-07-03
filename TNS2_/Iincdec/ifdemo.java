package Iincdec;

public class ifdemo {
	public static void main(String[] args) {
		int age = 19;
		
		if(age >= 18)
		{
			System.out.println("U ARE VOTING");
	
		}
		else {
			System.out.println("Your are not voting");
		}
		
		int x= 8, y=7;
		int a =10;
		int b= 11;
		
		if(x >= y) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
		if(!(a<b) || (a==b)) {
			System.out.println("Con is true");
		}else {
			System.out.println("con is false");
		}
		
		System.out.println(!(a<b));
		
		int u =30, v=20, z=50;
		
		System.out.println("The largest no is:");
		if(u>v) {
			if(u>z) {
				System.out.println(u);
			}else {
				System.out.println(z);
			}
		}
			else {
				if(z>v) {
					System.out.println(z);
					
				}else {
					System.out.println(v);
				}
			}
			
		int i = 100;
		
		for(i = 1; i<=100 ; i++)
		{
				System.out.println(i);
		}
		
			
	}

}
