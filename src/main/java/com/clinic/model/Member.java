package com.clinic.model;

public class Member {
	private String firstName;
	private String lastName;
	private String password;
	private String repassword;
	
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
	public void setLastName(){
		this.lastName = lastName;
	}
	public String getPassword(){return password;}
	public void setPassword(){
		this.password = password;
	}
	public String getRepassword(){return repassword;}
}
