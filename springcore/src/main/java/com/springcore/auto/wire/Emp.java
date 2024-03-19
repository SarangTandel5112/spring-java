package com.springcore.auto.wire;

public class Emp {
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
