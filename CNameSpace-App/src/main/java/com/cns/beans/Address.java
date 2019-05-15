package com.cns.beans;

public class Address {
	Integer hNo;
	String Street;
	String city;
	String country;
	public Address(Integer hNo, String street, String city, String country) {
	
		this.hNo = hNo;
		Street = street;
		this.city = city;
		this.country = country;
	}
	
	public Integer gethNo() {
		return hNo;
	}

	public void sethNo(Integer hNo) {
		this.hNo = hNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
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

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", Street=" + Street + ", city=" + city + ", country=" + country + "]";
	}
	

}
