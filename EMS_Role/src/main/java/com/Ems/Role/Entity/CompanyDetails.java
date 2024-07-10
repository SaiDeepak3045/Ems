package com.Ems.Role.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name = "companydetails")		
public class CompanyDetails {
	
    @Id
    private String userId;
    private String password;
    private String companyName; 
    private String ownerName;
    private String website;
    private String contactNo;
    private String emailId;
    private String addressLine;
    private String city;
    private String state;
    private Long pinCode;
    private String country;

    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CompanyDetails(String userId, String password, String companyName, String ownerName, String website,
			String contactNo, String emailId, String addressLine, String city, String state, Long pinCode,
			String country) {
		super();
		this.userId = userId;
		this.password = password;
		this.companyName = companyName;
		this.ownerName = ownerName;
		this.website = website;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}
	public CompanyDetails() {
		super();
	}

	
	
    // Constructors, getters, and setters
    
    
    
    
    
    
    
}