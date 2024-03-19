package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}
}
