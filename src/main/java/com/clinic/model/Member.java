package com.clinic.model;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Member {
	@Id
    @GeneratedValue
    @Column(name = "RECORD_ID", unique = true, nullable = false)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String repassword;
	
	public Member() {}
	
	public Member(int id, String firstName, String lastName, String email, String password, String repassword){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
	}
	
	public int getId(){return id;}
	public void setId(int id){
		this.id = id;
	}
	public String getFirstName(){return firstName;}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){return lastName;}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getEmail() {return email;}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword(){return password;}
	public void setPassword(String password){
		this.password = password;
	}
	public String getRepassword(){return repassword;}
	public void setRepassword(String repassword){
			this.repassword = repassword;
	}
}
