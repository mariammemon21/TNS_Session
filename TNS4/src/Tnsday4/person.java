package Tnsday4;

import java.util.Scanner;

public class person {
	
	private String personName;
	private int personAge;
	private String  personCity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public person() {
		System.out.println("Default constructor ");
	}
	public person(String personName, int personAge, String personCity) {
		System.out.println("Para constructor ");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	

}
