package com.cg.hb.model;

import javax.persistence.Column;

public class Address {
	@Column(name="door_no")
	private String doorNumber;
	@Column(name="street")
	private String street;
	@Column
	private String pincode;
	public Address() {
		// TODO Auto-generated constructor stub
		
	}
	public Address(String doorNumber, String street, String pincode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.pincode = pincode;
	}

}
