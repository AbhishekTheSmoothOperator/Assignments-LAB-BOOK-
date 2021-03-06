package com.cg.jh03.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh03.entity.Course;
import com.cg.jh03.entity.Student;
import com.cg.jh03.util.JPAUtil;

public class GetStudentsByCourse {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Course course = em.find(Course.class, 1L);
		
		if(course != null) {
			System.out.println(course);
			System.out.println(course.getStudents());
		}
		JPAUtil.shutdown();
	}

}
