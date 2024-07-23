package Tnsday4;
import java.util.Scanner;

public class Persond {
	
	public static void main(String[] args) {

		person p1= new person();
		
		Scanner sc = new Scanner(System.in);
		
		String name , city ;
		int age ;
		System.out.println("Enter Person details : Name , Age and city");
		name= sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		p1.setPersonName(name);
		
		System.out.println("Person Details Name : " + p1.getPersonName()
		+" "+ p1.getPersonCity()+ " " + p1.getPersonAge());
				
		System.out.println("Enter Person details : Name , Age and city");
		name= sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1 = new person(name, age, city);
		System.out.println("Person Details Name : " + p1.getPersonName()
		+" "+ p1.getPersonCity()+ " " + p1.getPersonAge());

		}


}
