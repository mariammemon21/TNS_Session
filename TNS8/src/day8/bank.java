package day8;

public interface bank {
	
	final static float MINBAL =5000;
	final static float Dep_lim= 25000;
	
	public void deposit (float amount); 
	public void withdraw(float amount);
	

}
