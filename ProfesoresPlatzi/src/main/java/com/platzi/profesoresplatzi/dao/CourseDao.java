package com.platzi.profesoresplatzi.dao;

import java.util.List;

import com.platzi.profesoresplatzi.model.Course;


public interface CourseDao {
	
	void saveCourse(Course course);
	
	List<Course> findAllCourses();
	
	void deleteCourse(Long idCourse);
	
	void updateCourse(Course course);
	
	Course findCourseById(Long idCourse);
	
	Course findCourseByName(String name);
	
	List<Course> findByIdTeacher(Long idTeacher);
}
