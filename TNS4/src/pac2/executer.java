package pac2;

import com.
public class executer {
	public static void main(String[] args) {

		//accessing different package class
		
		Tnsday4 b1 = new Tnsday4();
		
		//private , default and protected members can't access
		
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
		
	}

}
