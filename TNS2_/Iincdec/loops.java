package Iincdec;

public class loops {
	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		
	//	for integer array 
		for(int i : a  )
		{
			System.out.println(i);
		}
		
		
		//DO-WHILE loop
		char ch[] = {'j','a','v','a'};
		for (char c : ch)
		{
			System.out.println(c);
		}
		
		String s1[] = {"Java", "Programming", "Learning"};
		
		for(String s: s1)
		{
			System.out.print(s+" ");
			
			int j=11;
			do {
				System.out.println(j);
				j++;
			}
			while (j <=1);
		}
		
		//Nested For Loop
		
		int beg=10;
		int end=20;
		
		for(int  x=beg; x <=end; x++ )
		{
			for(int y=1; y<=10; y++)
			{
				System.out.println(x + "*" + y + "=" + x*y);
				
			}
			
			System.out.println();
		}
		
		
		
	}
}
