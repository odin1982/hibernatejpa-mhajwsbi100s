package org.hjpa.springbootin10steps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hjpa.springbootin10steps.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {
	private final String insert="insert into person(id,name,location,birth_date) values (?,?,?,?)";
	private final String update="update person set name=?,location=?,birth_date=? where id=?";
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id") );
			person.setName( rs.getString("name"));
			person.setBirthDate(rs.getDate("birth_date").toLocalDate());
			person.setLocation(rs.getString("location")  );
			
			return person;
		}
		
	}
	
	
	//select * from person
	public List<Person> findAll(){
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}
	
	//with RowMapper
	public List<Person> findAllWithRowMapper(){
		return jdbcTemplate.query("select * from person", new PersonRowMapper());
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
