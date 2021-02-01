package org.hjpa.springbootin10steps;

import java.time.LocalDate;

import org.hjpa.springbootin10steps.dao.PersonJdbcDao;
import org.hjpa.springbootin10steps.entity.Person;
import org.hjpa.springbootin10steps.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}",repository.findById(1001));
//		logger.info("All users:\n {}",dao.findAll());
//		logger.info("All users:\n {}",dao.findAllWithRowMapper());
//		logger.info("User id 10001 deleted-> {}",dao.deletedById(1002));
//		logger.info("insert: 1004" + dao.insert(new Person(1004,"Jonathan","Ecatepec",LocalDate.now())));
//		logger.info("update: 1004" + dao.update(new Person(1000,"Romano","Santa fe",LocalDate.now())));
	}

}
