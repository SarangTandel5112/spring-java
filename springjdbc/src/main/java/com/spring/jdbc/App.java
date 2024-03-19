package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program Start!");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student = new Student();
//		student.setId(1);
//		student.setName("myName");
//		student.setCity("Valsad");
//
//		int result = studentDao.insert(student);
//		System.out.println(result);

//		Student student = new Student();
//
//		student.setId(12);
//		student.setName("Sarang");
//		student.setCity("Kosamba");
//
//		int result = studentDao.change(student);
//		System.out.println("data changed" + result);

//		int delete = studentDao.delete(1);
//		System.out.println("deleted" + delete);

//		Student student = studentDao.getStudent(12);
//		System.out.println(student);

		List<Student> student = studentDao.getAllStudent();
		for (Student s : student) {
			System.out.println(s);
		}
	}
}
