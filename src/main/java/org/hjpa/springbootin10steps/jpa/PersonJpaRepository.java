package org.hjpa.springbootin10steps.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hjpa.springbootin10steps.entity.Person;
import org.springframework.stereotype.Repository;

//Repository
//Transaction
@Repository
@Transactional
public class PersonJpaRepository {

	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id); //JPA
	}
}
