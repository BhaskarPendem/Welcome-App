package com.cns.beans;

public class Person {
	Integer pId;
	String fName;
	String lName;
	Address address;
	public Person(Integer pId, String fName, String lName, Address address) {
		super();
		this.pId = pId;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	
	}
	
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", fName=" + fName + ", lName=" + lName + ", address=" + address + "]";
	}
	
	

}
