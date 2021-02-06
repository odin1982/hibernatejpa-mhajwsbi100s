package org.hjpa.springbootin10steps.repository;

import javax.persistence.EntityManager;

import org.hjpa.springbootin10steps.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	public void deleteById(Long id) {
		Course course = this.findById(id);
		em.remove(course);
	}

	public Course save(Course course) {
		if(course.getId() == null) {
			em.persist(course);
		}else {
			em.merge(course);
		}
		return course;
	}
}
