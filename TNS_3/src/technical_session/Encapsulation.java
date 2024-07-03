package technical_session;

public class Encapsulation {
	
public static void main(String[] args) {

		
		//object creation
		OOPS obj= new OOPS();
		
		obj.setName("Mariam");
		obj.setAge(21);
		obj.setSerilaNum(1001);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerilaNum());
		
		System.out.println(obj);
}
}
