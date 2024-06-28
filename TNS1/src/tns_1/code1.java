package tns_1;

public class code1 {
	
	public static void main (String[] args) {
		System.out.println("Hello");
		char x = 2;
		char y =3;
		System.out.println(x+y);
		String z="3";
		String d = "4";
		System.out.println(z+d);
		int r =4;
		System.out.println(r++);
		System.out.println(r);
		System.out.println(++r);
		
		int ab = 2;
		System.out.println((ab++) - (++ab));
		
		int a=0;
		int b= -1;
		int c= 1;
		
		System.out.println(--a);
		System.out.println(--c);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(c);
		System.out.println(--b);//-2
		System.out.println(--a);//-1
		System.out.println(++a);//0
		System.out.println(a--);//0
		System.out.println(--c);//-2
		System.out.println(b);//-2
		System.out.println(b--);//-2
		System.out.println(--b);//-4
		System.out.println(a++);//-1
		System.out.println(--b);//-5
		
		System.out.println((--a) + (--c) + (a++) + (--b) - (c--) + (c) -(--b) - (--a));
		
		
	}

}
