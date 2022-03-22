package com.example.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="binno")
public class Citybin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="city_name")
	private String CityName;
	
	@Column(name="pin_code")
	private int PinCode;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		this.CityName = cityName;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		this.PinCode = pinCode;
	}

	public Citybin() {
		
	}

	public Citybin(int id,String cityName, int pinCode) {
		super();
		this.Id=id;
		this.CityName = cityName;
		this.PinCode = pinCode;
	}

	
	
}
