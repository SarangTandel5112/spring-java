package com.springcore.javaconfig;

public class Student {
	private Samosa samosa;

	public void study() {
		this.samosa.display();
		System.out.println("student is reading book.");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
}
