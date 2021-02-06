package org.hjpa.springbootin10steps.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hjpa.springbootin10steps.DemoApplication;
import org.hjpa.springbootin10steps.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
@SpringBootTest(classes=DemoApplication.class)
public class CourseRepositoryTest {
	private Logger log =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	
	@Test
	public void findById() {
		Course course = repository.findById(1002L);
		assertNotNull(course);
	}

	@Test
	@DirtiesContext
	public void deleteById() {
		repository.deleteById(1002L);
		assertNull(repository.findById(1002L));
	}
	
	@Test
	@DirtiesContext
	public void save_basic() {
		Course course = repository.findById(1001L);
		assertEquals("hibernate-jpa", course.getName());
		course.setName("bootstrap");
		repository.save(course);
		
		Course course2 = repository.findById(1001L);
		assertEquals("bootstrap",course2.getName());
		
	}

}
