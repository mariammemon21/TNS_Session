package day9;

public class stringcom {
	public static void main(String[] args) {
		String s1="tnsif";
		String s2="tnsif";
		
		String s3= new String("tnsif");
		
		System.out.println("Cse 1: "+(s1==s2));
		System.out.println("Case 2:"+(s1==s3));
		System.out.println("Case 3:"+(s2.equals(s3)));
	}

}
