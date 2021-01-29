package org.hjpa.springbootin10steps.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hjpa.springbootin10steps.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {
	private final String insert="insert into person(id,name,location,birth_date) values (?,?,?,?)";
	private final String update="update person set name=?,location=?,birth_date=? where id=?";
	@Autowired
	JdbcTemplate jdbcTemplate;
	//select * from person
	public List<Person> findAll(){
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}
	
	public Person findById(int id){
		return (Person) jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{id}, new BeanPropertyRowMapper(Person.class));
	}
	
	public int deletedById(int id){
		return jdbcTemplate.update("delete from person where id=?",new Object[]{id});
	}
	
	public int insert(Person person) {
		return jdbcTemplate.update(insert, 
				new Object[] {	person.getId(),
								person.getName(),
								person.getLocation(),
								person.getBirthDate()});
	}
	
	public int update(Person person) {
		return jdbcTemplate.update(update, 
				new Object[] {
								person.getName(),
								person.getLocation(),
								person.getBirthDate(),
								person.getId()});
	}

}
