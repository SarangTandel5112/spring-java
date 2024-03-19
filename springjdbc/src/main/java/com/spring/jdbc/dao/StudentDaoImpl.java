package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		// insert data
		return r;
	}

	@Override
	public int change(Student student) {
		// update data
		String query = "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return update;
	}

	@Override
	public int delete(int studentId) {
		// delete query

		String query = "delete from student where id=?";
		int update = this.jdbcTemplate.update(query, studentId);
		return update;
	}

	@Override
	public Student getStudent(int studentId) {
		// get single student data
		String query = "select * from student where id=?";

		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// Select all student
		String query = "select * from student";
		List<Student> query2 = this.jdbcTemplate.query(query, new RowMapperImpl());
		return query2;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
