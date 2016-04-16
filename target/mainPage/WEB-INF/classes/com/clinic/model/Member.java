package com.clinic.model;

public class Member {
	private string firstName;
	private string lastName;
	
	public Member() {}
	
	public Member(String firstName, String lastName, String password, String repassword){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.repassword = repassword;
	}
	public String getFirstName(){return firstName;}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){return lastName;}
	public String setLastName(){
		this.lastName = lastName;
	}
}
