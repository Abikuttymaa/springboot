package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="individual")
public class Individual implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	
	@Column(name="policyid")
	private String Policyid;
	
	@Column(name="date")
	private Date Date;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="phoneno")
	private int PhoneNo;
	
	@Column(name="country")
    private String Country;
    
	@Column(name="date_of_birth")
    private Date DateOfBirth;
    
	@Column(name="gender")
    private String Gender;
    
	@Column(name="height")
    private int Height;
    
	@Column(name="weight")
    private int Weight;
    
	@Column(name="smokeryn")
    private String Smokeryn;
    
	@Column(name="exercise_regurely")
    private String ExerciseRegurely;
    
	@Column(name="number_of_children")
    private String NumberOfChildren;

	
	
	public String getPolicyid() {
		return Policyid;
	}

	public void setPolicyid(String policyid) {
		this.Policyid = policyid;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		this.Date = date;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.PhoneNo = phoneNo;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		this.Height = height;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		this.Weight = weight;
	}

	public String getSmokeryn() {
		return Smokeryn;
	}

	public void setSmokeryn(String smokeryn) {
		this.Smokeryn = smokeryn;
	}

	public String getExerciseRegurely() {
		return ExerciseRegurely;
	}

	public void setExerciseRegurely(String exerciseRegurely) {
		this.ExerciseRegurely = exerciseRegurely;
	}

	public String getNumberOfChildren() {
		return NumberOfChildren;
	}

	public void setNumberOfChildren(String numberOfChildren) {
		this.NumberOfChildren = numberOfChildren;
	}
    
   public Individual() {
	   
   }

public Individual(java.util.Date date, String name, String email, int phoneNo, String country,
		java.util.Date dateOfBirth, String gender, int height, int weight, String smokeryn, String exerciseRegurely,
		String numberOfChildren) {
	super();
	Date = date;
	Name = name;
	Email = email;
	PhoneNo = phoneNo;
	Country = country;
	DateOfBirth = dateOfBirth;
	Gender = gender;
	Height = height;
	Weight = weight;
	Smokeryn = smokeryn;
	ExerciseRegurely = exerciseRegurely;
	NumberOfChildren = numberOfChildren;
}
    
}
