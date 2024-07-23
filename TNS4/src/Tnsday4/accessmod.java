package Tnsday4;

public class accessmod {
	
	//declaring privat,protected and public bariables
	
	int var=10 ;// default
	public int varP=10; //public
	private int varp= 30; //private
	protected int varpr=40; //protected
	
	void methodDefault()
	{
		System.out.println("Default access base class");
		System.out.println("Default var:"+var);
		
	}
	
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("Public var:"+varP);
		
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println("Private var:"+varp);
		
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected var:"+varpr);
		
	}
	
	
}
