package com.example.sms.entity;

import javax.persistence.*;

@Entity
@Table(name="students",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;
	

	private String lastName;


	private String email;




private String PhoneNumber;

private String Gender;

private String Department;

private String Rollnumber;
	
	public Student()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRollnumber() {
		return Rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.Rollnumber= rollnumber;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
	     this.Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}

	public Student(String firstName, String lastName, String email,String RollNumber, String PhoneNumber, String Gender, String Department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.Rollnumber = RollNumber;
		this.PhoneNumber = PhoneNumber;
		this.Gender =Gender;
		this.Department=Department;
		
	}

}
