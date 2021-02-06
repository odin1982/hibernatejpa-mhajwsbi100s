package org.hjpa.springbootin10steps;

import org.hjpa.springbootin10steps.entity.Course;
import org.hjpa.springbootin10steps.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Course course = repository.findById(1000L);
//		log.info("\nCourse 1000 ----> "+course);

//		repository.deleteById(1003L);
		
		
		/*Example save a Course*/
		Course course = new Course("design pattern");
		repository.save(course);
		
		
		/*Example update a Course*/
		Course course1001 = repository.findById(1001L);
		course1001.setName("hibernate-jpa");
		repository.save(course1001);
		Course course1001upodated = repository.findById(1001L);
		log.info("course1001 updated:\n"+course1001upodated);
		
		
	}

}
