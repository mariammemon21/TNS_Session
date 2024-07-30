package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deivision {
	public static void main(String[] args)
	{
		int a , b , c;
		Scanner src= new Scanner(System.in);
		System.out.println("Enter two Number");
		try {
			a= src.nextInt();
			b= src.nextInt();
			c=a/b;
			 System.out.println("Devision is :"+c);
		}
		catch(Exception e){
			System.out.println("Exception Caught"+e.getMessage());
			
		}
	}
	

}
 