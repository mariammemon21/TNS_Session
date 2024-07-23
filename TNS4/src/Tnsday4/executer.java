package Tnsday4;

public class executer {
	
	public static void main(String[] args) {
		
		accessmod a1 =  new accessmod();
		a1.methodDefault();
		a1.methodProtected();
		a1.methodPublic();
		
		a1.var=20;
		a1.methodDefault();
		
		a1.varpr=24;
		a1.methodProtected();
		
		a1.varP=16;
		a1.methodPublic();
		
		
		//instance of operator
		System.out.println(a1 instanceof accessmod);
	
		
	}

}
