package com.example.demo.Model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="health")
public class Health implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    
	@Column(name="policyid",nullable=false)
	private String Policyid;
	
	@Column(name="sur_name",nullable=false)
	private String SurName;
	
	@Column(name="first_name",nullable=false)
	private String FirstName;
	
	@Column(name="last_name",nullable=false)
	private String LastName;
	
	@Column(name="father_name",nullable=false)
	private String FatherName;
	
	@Column(name="mother_name",nullable=false)
	private String MotherName;
	
	@Column(name="date_of_birth",nullable=false)
	private Date DateOfBirth;
	
	@Column(name="nationality",nullable=false)
	private String Nationality;
	
	@Column(name="address",nullable=false)
	private String Address;
	
	@Column(name="age",nullable=false)
	private int Age;
	
	@Column(name="city",nullable=false)
	private String City;
	
	@Column(name="pin_code",nullable=false)
	private int PinCode;
	
	@Column(name="phone_no",nullable=false)
	private int PhoneNo;
	
	@Column(name="email",nullable=false)
	private String Email;
	
	@Column(name="occupation",nullable=false)
	private String Occupation;
	

	public String getPolicyid() {
		return Policyid;
	}

	public void setPolicyid(String policyid) {
		this.Policyid = policyid;
	}

	public String getSurName() {
		return SurName;
	}

	public void setSurName(String surName) {
		this.SurName = surName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		this.FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		this.MotherName = motherName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		this.Nationality = nationality;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this. Address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		this.PinCode = pinCode;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		this.Occupation = occupation;
	}
	
	
    public Health() {
    	
    }

	public Health(String policyid, String surName, String firstName, String lastName, String fatherName,
			String motherName, Date dateOfBirth, String nationality, String address, int age, String city, int pinCode,
			int phoneNo, String email, String occupation) {
		super();
		Policyid = policyid;
		SurName = surName;
		FirstName = firstName;
		LastName = lastName;
		FatherName = fatherName;
		MotherName = motherName;
		DateOfBirth = dateOfBirth;
		Nationality = nationality;
		Address = address;
		Age = age;
		City = city;
		this.PinCode = pinCode;
		this.PhoneNo = phoneNo;
		Email = email;
		Occupation = occupation;
	}


	

	

	
}
