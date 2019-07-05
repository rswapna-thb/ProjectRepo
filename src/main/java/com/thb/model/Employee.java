package com.thb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "details")
public class Employee {



	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
   
	private String firstName;
	@Column
    private	String lastName;
	@Column 
	private  String email;
	@Column
	private String gender;
	@Column
	private String status;
	@Column
	private String dob;
	@Column
	private String tenYear;
	@Column
	private String tenPercent;
	@Column
	private String twelveYear;
	@Column
	private String twelvePercent;
	@Column
	private String beYear;
	@Column
	private String bePercent;
	@Column
	private String parAddress;
	@Column
	private String preAddress;
	@Column
	private String city;
	@Column
	private String country;
	@Column
	private String mNumber;
	@Column
	private String fatherName;
	@Column
	private String pan;
	@Column
	private String adhaar;
	@Column
	private String passport;
	@Column
	private String crtPassword;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTenYear() {
		return tenYear;
	}
	public void setTenYear(String tenYear) {
		this.tenYear = tenYear;
	}
	public String getTenPercent() {
		return tenPercent;
	}
	public void setTenPercent(String tenPercent) {
		this.tenPercent = tenPercent;
	}
	public String getTwelveYear() {
		return twelveYear;
	}
	public void setTwelveYear(String twelveYear) {
		this.twelveYear = twelveYear;
	}
	public String getTwelvePercent() {
		return twelvePercent;
	}
	public void setTwelvePercent(String twelvePercent) {
		this.twelvePercent = twelvePercent;
	}
	public String getBeYear() {
		return beYear;
	}
	public void setBeYear(String beYear) {
		this.beYear = beYear;
	}
	public String getBePercent() {
		return bePercent;
	}
	public void setBePercent(String bePercent) {
		this.bePercent = bePercent;
	}
	public String getParAddress() {
		return parAddress;
	}
	public void setParAddress(String parAddress) {
		this.parAddress = parAddress;
	}
	public String getPreAddress() {
		return preAddress;
	}
	public void setPreAddress(String preAddress) {
		this.preAddress = preAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getmNumber() {
		return mNumber;
	}
	public void setmNumber(String mNumber) {
		this.mNumber = mNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getCrtPassword() {
		return crtPassword;
	}
	public void setCrtPassword(String crtPassword) {
		this.crtPassword = crtPassword;
	}

}
